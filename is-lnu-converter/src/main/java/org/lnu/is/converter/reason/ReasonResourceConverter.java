package org.lnu.is.converter.reason;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.reason.Reason;
import org.lnu.is.resource.reason.ReasonResource;

/**
 * Reason resource converter.
 * @author ivanursul
 *
 */
@ResourceConverter("reasonResourceConverter")
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
