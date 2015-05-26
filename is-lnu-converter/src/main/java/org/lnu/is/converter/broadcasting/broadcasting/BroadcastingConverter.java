package org.lnu.is.converter.broadcasting.broadcasting;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;

/**
 * BroadcastintMessageResource -> BroadcastingMessageResource converter.
 * @author ivanursul
 *
 */
@Converter("broadcastingBroadcastingConverter")
public class BroadcastingConverter extends AbstractConverter<BroadcastingMessageResource, BroadcastingMessageResource> {

	@Override
	public BroadcastingMessageResource convert(final BroadcastingMessageResource source, final BroadcastingMessageResource target) {
		
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public BroadcastingMessageResource convert(final BroadcastingMessageResource source) {
		return convert(source, new BroadcastingMessageResource());
	}

}
