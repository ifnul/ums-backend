package org.lnu.is.mailing.sender;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

import org.apache.commons.io.IOUtils;
import org.lnu.is.mailing.exception.MailException;
import org.lnu.is.mailing.model.Attachment;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.model.Recipient;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * Service, that sends mail to appropriate receipients.
 * @author ivanursul
 *
 */
@Component("emailSenderAdapter")
public class DefaultEmailSenderAdapter implements EmailSenderAdapter {
	private static final String ENCODING = "UTF-8";
	private static final String EXCEPTION_MESSAGE = "Exception occurs during email sending";

	@Resource(name = "mailSender")
	private JavaMailSender mailSender;
	
	@Override
	public void send(final Email email) {
		Assert.notNull(email, "Email object cannot be null");
		
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, ENCODING);
		
			messageHelper.setFrom(email.getSender());
			messageHelper.setTo(getRecipientsArray(email.getRecipients()));
			messageHelper.setCc(getRecipientsArray(email.getCcRecipients()));
			messageHelper.setSubject(email.getTopic());
			messageHelper.setText(email.getContent(), email.isHtml());
	
			for (Attachment attachment : email.getAttachments()) {
				messageHelper.addAttachment(attachment.getFileName(), new ByteArrayResource(IOUtils.toByteArray(attachment.getInputStream())));
			}
			
			mailSender.send(message);
		} catch (Exception e) {
			throw new MailException(EXCEPTION_MESSAGE, e);
		}
		
	}

	/**
	 * Method for getting recipient array of string.
	 * @param recipients
	 * @return array of string recipients.
	 */
	private String[] getRecipientsArray(final List<Recipient> recipients) {
		Set<String> set = new HashSet<String>();
		
		for (Recipient recipient : recipients) {
			set.add(recipient.getEmail());
		}
		
		return set.toArray(new String[set.size()]);
	}
 
}
