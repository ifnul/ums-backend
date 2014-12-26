package org.lnu.is.facade.converter.reason;

import org.lnu.is.annotations.Converter;
import org.lnu.is.domain.reason.Reason;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.reason.ReasonResource;

/**
 * Reason resource converter.
 * @author ivanursul
 *
 */
@Converter("reasonResourceConverter")
public class ReasonResourceConverter extends AbstractConverter<ReasonResource, Reason> {

	@Override
	public Reason convert(final ReasonResource source, final Reason target) {
		
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public Reason convert(final ReasonResource source) {
		return convert(source, new Reason());
	}

}
