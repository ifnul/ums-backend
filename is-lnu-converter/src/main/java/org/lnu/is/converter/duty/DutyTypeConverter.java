package org.lnu.is.converter.duty;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.dutytype.DutyType;
import org.lnu.is.resource.duty.type.DutyTypeResource;

/**
 * Duty Type Converter.
 * 
 * @author ivanursul
 * 
 */
@ResourceConverter("dutyTypeConverter")
public class DutyTypeConverter extends AbstractConverter<DutyType, DutyTypeResource> {

	@Override
	public DutyTypeResource convert(final DutyType source, final DutyTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public DutyTypeResource convert(final DutyType source) {
		return convert(source, new DutyTypeResource());
	}

}
