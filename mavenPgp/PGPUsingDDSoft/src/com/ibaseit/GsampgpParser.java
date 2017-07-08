package com.ibaseit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;

import org.bouncycastle.openpgp.PGPException;


public class GsampgpParser {

	private boolean isArmored = false;

	private boolean integrityCheck = true;

	private String pubKeyFile = "PGP_Private.pgp";
	private String privKeyFile = "PGP_Public.pgp";

	private String plainTextFile = "plain-text.txt";
	private String cipherTextFile = "cypher-text.dat";
	private String decPlainTextFile = "dec-plain-text.txt";

	private String id = "95B6679D";
	private static String passwd = "<Yn#Jtt>vz6[8pD{";
	char p[] = passwd.toCharArray();

	
	public void encrypt() throws NoSuchProviderException, IOException, PGPException {
		FileInputStream pubKeyIs = new FileInputStream(pubKeyFile);
		FileOutputStream cipheredFileIs = new FileOutputStream(cipherTextFile);
		PGPUtils.encryptFile(cipheredFileIs, plainTextFile,
				PGPUtils.readPublicKey(pubKeyIs), isArmored, integrityCheck);
		cipheredFileIs.close();
		pubKeyIs.close();
	}

	public void decrypt() throws Exception {

		FileInputStream cipheredFileIs = new FileInputStream(cipherTextFile);
		FileInputStream privKeyIn = new FileInputStream(privKeyFile);
		FileOutputStream plainTextFileIs = new FileOutputStream(decPlainTextFile);
		PGPUtils.decryptFile(cipheredFileIs, plainTextFileIs, privKeyIn, passwd.toCharArray());
		cipheredFileIs.close();
		plainTextFileIs.close();
		privKeyIn.close();
	}

	public void decrypt(File cipheredFile) throws Exception {

		ClassLoader classLoader = this.getClass().getClassLoader();
		File configFile1 = new File(classLoader.getResource("resources/PGP_Private.pgp").getFile());
		FileInputStream privateKey = new FileInputStream(configFile1);
		FileInputStream encryptedFile = new FileInputStream(cipheredFile);
		FileOutputStream plainTextFile = new FileOutputStream(cipheredFile.getAbsolutePath() + ".txt");

		// encryptFile(cipheredFileIs, plainTextFile,
	   PGPUtils.decryptFile(encryptedFile, plainTextFile, privateKey, passwd.toCharArray());

		// plainTextFile.close();

	}

	public static void main(String[] args) throws Exception {
		GsampgpParser gsampgpParser = new GsampgpParser();
		gsampgpParser.decrypt();
		//gsampgpParser.decrypt();
	}
}