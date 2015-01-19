package org.lnu.is.converter.duty;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.dutytype.DutyType;
import org.lnu.is.resource.duty.type.DutyTypeResource;

/**
 * Duty Type Resource Converter.
 * 
 * @author ivanursul
 *
 */
@ResourceConverter("dutyTypeResourceConverter")
public class DutyTypeResourceConverter extends AbstractConverter<DutyTypeResource, DutyType> {

	@Override
	public DutyType convert(final DutyTypeResource source, final DutyType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public DutyType convert(final DutyTypeResource source) {
		return convert(source, new DutyType());
	}
}
