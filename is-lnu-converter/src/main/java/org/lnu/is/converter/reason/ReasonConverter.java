package org.lnu.is.converter.reason;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.reason.Reason;
import org.lnu.is.resource.reason.ReasonResource;

/**
 * Reason converter.
 * @author ivanursul
 *
 */
@Converter("reasonConverter")
public class ReasonConverter extends AbstractConverter<Reason, ReasonResource> {

	@Override
	public ReasonResource convert(final Reason source, final ReasonResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public ReasonResource convert(final Reason source) {
		return convert(source, new ReasonResource());
	}

}
