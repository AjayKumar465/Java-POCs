package com.ibaseit.testify;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class JsonDataEncrypt {

	private static PublicKey loadPublicKey(String fileName) {//	ObjectInputStream outputInputStream = getObjectInputStream(fileName);
		try {
			// Get Public Key
			RSAPublicKeySpec rsaPublicKeySpec = new RSAPublicKeySpec((BigInteger) outputInputStream.readObject(),
					(BigInteger) outputInputStream.readObject());
			return KeyFactory.getInstance("RSA").generatePublic(rsaPublicKeySpec);
			//return 	getPublicKey( fileName);
		} catch (Exception e) {
			throw new RuntimeException("Unable to load public key.", e);
		}
		

	}

	private static ObjectInputStream getObjectInputStream(String filePath) {
		try {
			return new ObjectInputStream(new FileInputStream(filePath));
		} catch (Exception e) {
			throw new RuntimeException("Unable to open input stream.", e);
		}
	}

	public static PublicKey getPublicKey(String filename) throws Exception {

		byte[] keyBytes = Base64.decodeBase64(Files.readAllBytes(Paths.get(filename)));

		X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePublic(spec);
	}

	public static PrivateKey getPrivateKey(String filename) throws Exception {

		byte[] keyBytes = Base64.decodeBase64(Files.readAllBytes(Paths.get(filename)));

		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePrivate(spec);
	}

	public static Map<String, String> encryptData(Map<String, String> clientInfo, String requestObject) {
		Map<String, String> encryptedData = new HashMap<>();
		try {
			KeyGenerator aesKeyGenerator = KeyGenerator.getInstance("AES");
			aesKeyGenerator.init(128); // The AES key size in number of bits
			SecretKey secretKey = aesKeyGenerator.generateKey();
			Cipher aesCipher = Cipher.getInstance("AES");
			aesCipher.init(Cipher.ENCRYPT_MODE, secretKey);
			byte[] requestByteObject = aesCipher.doFinal(requestObject.toString().getBytes());
			encryptedData.put("encryptedRequest", new String(Base64.encodeBase64String(requestByteObject)));
			Cipher rseCipher = Cipher.getInstance("RSA");
			rseCipher.init(Cipher.PUBLIC_KEY, loadPublicKey(clientInfo.get("encrypt_key")));
			byte[] encryptedAESKey = rseCipher.doFinal(secretKey.getEncoded());
			encryptedData.put("encryptedAESKey", Base64.encodeBase64String(encryptedAESKey));
		} catch (Exception e) {
			throw new RuntimeException("Unable to encrypt message.", e);
		}
		return encryptedData;
	}

	@SuppressWarnings("unchecked")
	public static String decryptData(Map<String, String> clientInfo, Object requestObject) {
		try {
			Cipher rsaCipher = Cipher.getInstance("RSA");
			rsaCipher.init(Cipher.PRIVATE_KEY, loadPrivateKey(clientInfo.get("decrypt_key")));
			byte[] decryptedAESKey = rsaCipher
					.doFinal(Base64.decodeBase64(((Map<String, String>) requestObject).get("encryptedAESKey")));
			Cipher aesCipher = Cipher.getInstance("AES");
			aesCipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptedAESKey, 0, decryptedAESKey.length, "AES"));
			return new String(aesCipher
					.doFinal(Base64.decodeBase64(((Map<String, String>) requestObject).get("encryptedRequest"))));
		} catch (Exception e) {
			throw new RuntimeException("Unable to decrypt message.", e);
		}
	}

	private static PrivateKey loadPrivateKey(String fileName) {
		ObjectInputStream outputInputStream = getObjectInputStream(fileName);
		try {
			// Get Private Key
			RSAPrivateKeySpec rsaPrivateKeySpec = new RSAPrivateKeySpec((BigInteger) outputInputStream.readObject(),
					(BigInteger) outputInputStream.readObject());
			return KeyFactory.getInstance("RSA").generatePrivate(rsaPrivateKeySpec);
			//return getPrivateKey(fileName);
		} catch (Exception e) {
			throw new RuntimeException("Unable to load private key.", e);
		}
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Map<String, String> clientInfo = new HashMap<>();
		String requestObject = "{\r\n" + "    \"vehicleDetails\": {\r\n" + "        \"regDate\": \"2020-01-30\",\r\n"
				+ "        \"purchasePrice\": 1000,\r\n" + "        \"transmission\": \"Manual\",\r\n"
				+ "        \"fuelType\": \"Gasoline\",\r\n" + "        \"regNum\": \"XXX5XDF\",\r\n"
				+ "        \"model\": \"F250 DSL\",\r\n" + "        \"make\": \"FORD\",\r\n"
				+ "        \"mileage\": 14000,\r\n" + "        \"orgcode\":\"D00042255\",\r\n"
				+ "        \"firstOwner\":\"yes\",\r\n" + "        \"vehicleUsage\":\"No Banding\",\r\n"
				+ "        \"engineCC\":\"324\",\r\n" + "        \"vehicleClass\":\"No Banding\"\r\n" + "      \r\n"
				+ "    },\r\n" + "    \"productDetails\": {\r\n" + "        \"autoRenewal\": \"\",\r\n"
				+ "        \"policySoldDate\": \"2020-01-30\",\r\n" + "        \"manuWarMonths\":\"24\",\r\n"
				+ "        \"claimExcessBand\":100,\r\n" + "        \"termMthsBand\": 12,\r\n"
				+ "        \"termMileageBand\":\"99999999\",\r\n" + "        \"coverType\":\"CSP Ultimate\",\r\n"
				+ "        \"productCode\":\"PayLink PLMBI\"\r\n" + "    }\r\n" + "    \r\n" + "}";
		clientInfo.put("encrypt_key", "D:\\paylink_public.txt");
		clientInfo.put("decrypt_key", "D:\\paylinkprivateKey.pem");
		// Map<String,String> encryptData = new HashMap<>();
		// encryptData.put("encryptedRequest",
		// "L9uh6SVWEF8ea4Dcrnj1iFbeCd4p6BSZQIJT+eiP1GG6fnJkBQwpMzIOvQunMOqfwAyKi0eNlhKtJLAbmyPeIBczzJ1USRbbQ6abEy1PdrjhrGCSZbsDsuCwoeOoiiFK0C6plq5X5SEs84XlI0uNvi8O/LKYprcmaYVhWHKcMrDHrUy10ans4wmzvqgLuAdeAX1Y9aZUtTDAl7jWYIFmlYy2B+RK+w9k+jWELVSmeyiNVVGUidSHvvEKAHm/eE93b+fKG97CV46xgcnjaluAhtPV2VLo+8blLJ3K91YhfckHkTGwIa7z9Vc96kgnJ7M2fJQln6Y9Bgl6b7QvT/k1DKshe0WCI5aln50SJTrUurGQSLrj4a0wV/t9128GasT6BTWBCE28vm11MbSliZEIYqvnAz+jbLuTNUWGa+8nOATruN7KEPYUYz8ogtCGASBukiUeLhXiogEo9x0vOeq+472ck4OXjRLNvBsuD3BIOrl620WMAQtoeud8FQKmMdKMHoLljXO9zMb+DAIixBB/f3dyeJqeFWl2rOdODcBHO3k5aGSa0N63ls4i8xntinVgm+hC6yth85GHofHEdEoU7Jw8SbbI0lGYw/gOGltfySJgANau5iwaOAqpsHSHvAB1tjD8q+HWkIROogEmrL/udOLr6OzN7SK7tfdpiv4PD9DdItwhaEihUH289llRCqH6aBJdL8YlfldjuzMbrKGf9EHkVpkis030Kc8WkYNpp3vECzBdAdVk5FVwtndx1y6RAwYLzg5Bx8AnGIC5uNY6yYeWtt39YMW50MRa9LpnylFzXqcjP8gCUFhr9AmMXLHt3h0BACPr31+uRisCFVY2N08c+GkiR1fQoxfIBorYxGoA+Fow181NwJDz4XkcfuSIykXFeg8XIVOHk9OXxVqD9KxaQir7jx4GEe5i5cRbcAOOyk360ZR+iTU2sgEEvLAJ5hCwGhcb9hvjIcito02iEL641CHgulARHxQ90U5NVkS/Uuj7Cc05fw6LOGrdLoqtEOE0tQJt3kxwoXZKwoYG9ouKjAKic2NMrVJ1IJcUV/RP27mVwaEZ49r4KxFnXsO0d6wf8pp7gW5fokQGS0L2+yTnJKUvTwdTNZVSZZlKlawMWmX++5uF8twXq1wbwm1Y52kzUdH0HOY/vv/uIs85xYaZ9JtzuF8nocr0Ck7GUWg5PpmUMXxvwKdiB0sfLIoRmWTFtLs8VjeeKO00ygFjE0EVBmXph7Eu7O2mhObTNpNr8Wqnw4dCIZ+OBuuzO8Pu8ussmdvshfk7d3gp/AypbmFFOm0QLON5D8HdGmFX1SX0s1+NLWaVEMrV7CdADaxk7mhrffi+4OsU3cxE37R4ex2tgLkAYl5HyN8m7EYABXKKWoHof4rWpc9jonC/ivzL8ZWtRA6gq0ryKIWfA7gANvqjRZ8uGNy0Gr5XKdclMvzSkq9Tgw+8UPyj5ya5iYbb918of1FdL1dIP3EvEuPzpcrUZv3N7+kFn2KVpylJt44=");
		// encryptData.put("encryptedAESKey",
		// "PwCmZYOLQLr8uNy8heAZjWVTEwiXC2/1L14ybZz9NZXL9O0w0XwkOMlQHRnRKjperlKIl2JFxNPlBnZ9hJzqRzznrjVFtgqfgvZ5H4AKl5H3dnqcApqX8Q+PqbbwRBPQUr6AdJc7nV+Io8LTTnqSmAsOpNpes0Y/F47dwv9wlpI7LTpjZuCNLvWRsMg8G7gTSkcx5jaclT5C94pXMq0yjigfNVNC4aIwnNvPwdZuD81FzHNP+AJWIwKzKW6Nk3u3zp6O6y1eKagR/3UuYNNaa/WEuBMBIzudN/ybrW07QSOvFmnfP1pqEeIuFEjdDXLPd3LXKQ1BBrQmodTdMaVD4w==")
		// ;
		Map<String, String> encryptData = encryptData(clientInfo, requestObject);
		System.out.println(encryptData);
	}
}
