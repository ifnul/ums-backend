package org.lnu.is.mailing.sender;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.mailing.exception.MailException;
import org.lnu.is.mailing.model.Attachment;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.model.Recipient;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.mail.javamail.JavaMailSender;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEmailSenderAdapterTest {

	@Mock
	private JavaMailSender mailSender;
	
	@Mock
	private MimeMessage mimeMessage;

	@InjectMocks
	private DefaultEmailSenderAdapter unit;
	
	@Test
	public void testSend() throws Exception {
		// Given
		Attachment attachment1 = new Attachment();
		String fileName1 = "filename1";
		InputStream inputStream1 = new ByteArrayInputStream("SomeContent1".getBytes());
		attachment1.setFileName(fileName1);
		attachment1.setInputStream(inputStream1);
		
		Attachment attachment2 = new Attachment();
		String fileName2 = "filename2";
		InputStream inputStream2 = new ByteArrayInputStream("SomeContent2".getBytes());
		attachment2.setFileName(fileName2);
		attachment2.setInputStream(inputStream2);
		List<Attachment> attachments = Arrays.asList(attachment1, attachment2);
		String email1 = "email1@email.email";
		Recipient recipient1 = new Recipient(email1);
		Recipient recipient2 = new Recipient("email2@email.email");
		List<Recipient> ccRecipients = Arrays.asList(recipient1, recipient2);

		List<Recipient> recipients = Arrays.asList(recipient1, recipient2);

		String content = "Simple content";
		boolean isHtml = false;
		String sender = "sender@mail.com";
		String topic = "Mail topic";

		Email email = new Email();
		email.setAttachments(attachments);
		email.setCcRecipients(ccRecipients);
		email.setContent(content);
		email.setHtml(isHtml);
		email.setRecipients(recipients);
		email.setSender(sender);
		email.setTopic(topic);

		// When
		when(mailSender.createMimeMessage()).thenReturn(mimeMessage);
		unit.send(email);

		// Then
		verify(mimeMessage).setFrom(any(InternetAddress.class));
		verify(mimeMessage).setRecipients(eq(Message.RecipientType.TO), any(InternetAddress[].class));
		verify(mimeMessage).setRecipients(eq(Message.RecipientType.CC), any(InternetAddress[].class));
		verify(mimeMessage).setSubject(topic, "UTF-8");
		verify(mailSender).send(mimeMessage);
	}

	@Test
	public void testSendWithEmptyAttachments() throws Exception {
		// Given
		String email1 = "email1@email.email";
		Recipient recipient1 = new Recipient(email1);
		Recipient recipient2 = new Recipient("email2@email.email");
		List<Recipient> ccRecipients = Arrays.asList(recipient1, recipient2);
		
		List<Attachment> attachments = Collections.emptyList();
		List<Recipient> recipients = Arrays.asList(recipient1, recipient2);
		
		String content = "Simple content";
		boolean isHtml = false;
		String sender = "sender@mail.com";
		String topic = "Mail topic";
		
		Email email = new Email();
		email.setAttachments(attachments);
		email.setCcRecipients(ccRecipients);
		email.setContent(content);
		email.setHtml(isHtml);
		email.setRecipients(recipients);
		email.setSender(sender);
		email.setTopic(topic);
		
		// When
		when(mailSender.createMimeMessage()).thenReturn(mimeMessage);
		unit.send(email);
		
		// Then
		verify(mimeMessage).setFrom(any(InternetAddress.class));
		verify(mimeMessage).setRecipients(eq(Message.RecipientType.TO), any(InternetAddress[].class));
		verify(mimeMessage).setRecipients(eq(Message.RecipientType.CC), any(InternetAddress[].class));
		verify(mimeMessage).setSubject(topic, "UTF-8");
		verify(mailSender).send(mimeMessage);
	}

	@Test(expected = MailException.class)
	public void testSendWithException() throws Exception {
		// Given
		Attachment attachment1 = new Attachment();
		String fileName1 = "filename1";
		InputStream inputStream1 = new ByteArrayInputStream("SomeContent1".getBytes());
		attachment1.setFileName(fileName1);
		attachment1.setInputStream(inputStream1);
		
		Attachment attachment2 = new Attachment();
		String fileName2 = "filename2";
		InputStream inputStream2 = new ByteArrayInputStream("SomeContent2".getBytes());
		attachment2.setFileName(fileName2);
		attachment2.setInputStream(inputStream2);
		List<Attachment> attachments = Arrays.asList(attachment1, attachment2);
		String email1 = "email1@email.email";
		Recipient recipient1 = new Recipient(email1);
		Recipient recipient2 = new Recipient("email2@email.email");
		List<Recipient> ccRecipients = Arrays.asList(recipient1, recipient2);
		
		List<Recipient> recipients = Arrays.asList(recipient1, recipient2);
		
		String content = "Simple content";
		boolean isHtml = false;
		String sender = "sender@mail.com";
		String topic = "Mail topic";
		
		Email email = new Email();
		email.setAttachments(attachments);
		email.setCcRecipients(ccRecipients);
		email.setContent(content);
		email.setHtml(isHtml);
		email.setRecipients(recipients);
		email.setSender(sender);
		email.setTopic(topic);
		
		// When
		when(mailSender.createMimeMessage()).thenReturn(mimeMessage);
		doThrow(Exception.class).when(mailSender).send(any(MimeMessage.class));
		unit.send(email);
		
		// Then
		verify(mimeMessage).setFrom(any(InternetAddress.class));
		verify(mimeMessage).setRecipients(eq(Message.RecipientType.TO), any(InternetAddress[].class));
		verify(mimeMessage).setRecipients(eq(Message.RecipientType.CC), any(InternetAddress[].class));
		verify(mimeMessage).setSubject(topic, "UTF-8");
		verify(mailSender).send(mimeMessage);
	}
	
}
