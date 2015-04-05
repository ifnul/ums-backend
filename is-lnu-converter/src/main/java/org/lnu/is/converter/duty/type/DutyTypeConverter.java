package org.lnu.is.converter.duty.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.duty.type.DutyType;
import org.lnu.is.resource.duty.type.DutyTypeResource;

/**
 * Duty Type Converter.
 * 
 * @author ivanursul
 * 
 */
@Converter("dutyTypeConverter")
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
