package com.ibaseit.discovery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

import javax.crypto.Cipher;

import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.bouncycastle.pkcs.PKCSException;

public class RSA {
	
	private  final String PASSPHRASE = "yourPassphrase";

	public   PublicKey getPublicKey(String filePath) throws CertificateException, IOException {
		InputStream inputStream = new FileInputStream(new File(filePath));
		Certificate cert = CertificateFactory.getInstance("X.509").generateCertificate(inputStream);
		inputStream.close();
		return cert.getPublicKey();
	}

	public  PrivateKey getPrivateKey(String filePath)
			throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException,
			IllegalAccessException, PKCSException, IOException, OperatorCreationException {
		Security.addProvider(new BouncyCastleProvider());
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		PEMParser pp = new PEMParser(br);
		PKCS8EncryptedPrivateKeyInfo pemKeyPair = (PKCS8EncryptedPrivateKeyInfo) pp.readObject();
		pp.close();
		Field field = Class.forName("javax.crypto.JceSecurity").getDeclaredField("isRestricted");
		field.setAccessible(true);
		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
		field.set(null, false);
		br.close();
		return new JcaPEMKeyConverter().getPrivateKey(pemKeyPair
				.decryptPrivateKeyInfo(new JceOpenSSLPKCS8DecryptorProviderBuilder().build(PASSPHRASE.toCharArray())));

	}
	
	public static String encrypt(String rawText, PublicKey publicKey) throws IOException, GeneralSecurityException {
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		return Base64.encodeBase64String(cipher.doFinal(rawText.getBytes("UTF-8")));
	}
	
	public static String decrypt(String cipherText, PrivateKey privateKey)
			throws IOException, GeneralSecurityException {
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		return new String(cipher.doFinal(Base64.decodeBase64(cipherText)), "UTF-8");
	}
}
