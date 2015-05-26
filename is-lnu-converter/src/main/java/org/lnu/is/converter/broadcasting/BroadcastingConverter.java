package org.lnu.is.converter.broadcasting;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.broadcasting.BroadcastingMessage;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;

/**
 * Broadcasting converter.
 * @author ivanursul
 *
 */
@Converter("broadcastingConverter")
public class BroadcastingConverter extends AbstractConverter<BroadcastingMessage, BroadcastingMessageResource> {

	@Override
	public BroadcastingMessageResource convert(final BroadcastingMessage source, final BroadcastingMessageResource target) {
		
		target.setId(source.getId());
		target.setContent(source.getContent());
		target.setTopic(source.getTopic());
		
		return target;
	}

	@Override
	public BroadcastingMessageResource convert(final BroadcastingMessage source) {
		return convert(source, new BroadcastingMessageResource());
	}

}
