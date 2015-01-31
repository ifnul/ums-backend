package org.lnu.is.converter.broadcasting.email;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.mailing.model.Attachment;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.model.Recipient;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;
import org.springframework.beans.factory.annotation.Value;

/**
 * Broadcasting email converter.
 * @author ivanursul
 *
 */
@Converter("broadcastingEmailConverter")
public class BroadcastingEmailConverter extends AbstractConverter<BroadcastingMessageResource, Email> {

	@Value("${mail.from}")
	private String sender;
	
	@Override
	public Email convert(final BroadcastingMessageResource source, final Email target) {
		
		target.setTopic(source.getTopic());
		target.setContent(source.getContent());

		target.setAttachments(Collections.<Attachment>emptyList());
		target.setCcRecipients(Collections.<Recipient>emptyList());
		target.setSender(sender);
		target.setHtml(source.getIsHtml());
		target.setRecipients(getRecipients(source));
		
		return target;
	}

	/**
	 * Methods gets recipients by groups and separate recipients.
	 * @param source
	 * @return List of recipients.
	 */
	private List<Recipient> getRecipients(final BroadcastingMessageResource source) {
		Set<Recipient> recipients = new HashSet<Recipient>();
		
		if (source.getRecipients() != null) {
			for (String rec : source.getRecipients()) {
				Recipient recipient = new Recipient(rec);
				recipients.add(recipient);
			}
		}
		
		return new ArrayList<Recipient>(recipients);
	}

	@Override
	public Email convert(final BroadcastingMessageResource source) {
		return convert(source, new Email());
	}

	public void setSender(final String sender) {
		this.sender = sender;
	}

}
