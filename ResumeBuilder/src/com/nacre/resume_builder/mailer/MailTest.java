package com.nacre.resume_builder.mailer;

import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailTest {
	public static void main(String[] args) {
deleteFile();

	}

	public static void deleteFile() {
String fname="E:\\aj\\ConProvider.java";
		File file = new File("E:\\collections.pdf");
		System.out.println(file.isFile());

		if (file.delete()) {
			System.out.println(file.getName() + " is deleted!");
		} else {
			System.out.println("Delete operation is failed.");
		}

	}

	public static void sendMail() {

		String host = "smtp.gmail.com";
		String port = "587";
		String mailFrom = "ajayajayk465@gmail.com";
		String password = "ajay18811";

		// 1) get the session object
		Properties properties = new Properties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.user", mailFrom);
		properties.put("mail.password", password);

		Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(mailFrom, password);
			}
		});

		// 2) compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress());
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("ajayanil465@gmail.com"));
			message.setSubject("Message Aleart");

			// 3) create MimeBodyPart object and set your message text
			BodyPart messageBodyPart1 = new MimeBodyPart();
			messageBodyPart1.setText("This is message body");

			// 4) create new MimeBodyPart object and set DataHandler object to
			// this object
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
		
			String filename = "E:\\collections.pdf";// change accordingly

			DataSource source = new FileDataSource(filename);
			messageBodyPart2.setDataHandler(new DataHandler(source));
			messageBodyPart2.setFileName(filename);

			// 5) create Multipart object and add MimeBodyPart objects to this
			// object
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart1);
			multipart.addBodyPart(messageBodyPart2);

			// 6) set the multiplart object to the message object
			message.setContent(multipart);

			// 7) send message
			Transport.send(message);

			System.out.println("message sent....");
deleteFile();
		} catch (MessagingException ex) {
			ex.printStackTrace();
		}
	}
}
