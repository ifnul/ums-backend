package org.lnu.is.converter.broadcasting.email;

import java.util.ArrayList;
import java.util.List;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.model.Recipient;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;

/**
 * Email Broadcasting Converter.
 * @author ivanursul
 *
 */
@Converter("emailBroadcastingConverter")
public class EmailBroadcastingConverter extends AbstractConverter<Email, BroadcastingMessageResource> {

	@Override
	public BroadcastingMessageResource convert(final Email source, final BroadcastingMessageResource target) {
		
		target.setContent(source.getContent());
		target.setIsHtml(source.isHtml());
		target.setRecipients(getRecipients(source));
		target.setTopic(source.getTopic());
		
		return target;
	}

	/**
	 * Method for getting recipients from email object.
	 * @param source
	 * @return recipients.
	 */
	private List<String> getRecipients(final Email source) {
		List<String> recipients = new ArrayList<String>();
		
		if (source.getRecipients() != null) {
			for (Recipient recipient : source.getRecipients()) {
				recipients.add(recipient.getEmail());
			}
		}
		
		return recipients;
	}

	@Override
	public BroadcastingMessageResource convert(final Email source) {
		return convert(source, new BroadcastingMessageResource());
	}

}
