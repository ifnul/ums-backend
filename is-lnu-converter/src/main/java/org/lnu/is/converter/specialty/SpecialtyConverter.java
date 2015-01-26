package org.lnu.is.converter.specialty;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.resource.specialty.SpecialtyResource;

/**
 * Converter that converts from Specialty to SpecialtyResource.
 * 
 * @author ivanursul
 *
 */
@Converter("specialtyConverter")
public class SpecialtyConverter extends AbstractConverter<Specialty, SpecialtyResource> {

	@Override
	public SpecialtyResource convert(final Specialty source, final SpecialtyResource target) {
		
		target.setId(source.getId());
		target.setAbbrName(source.getAbbrName());
		target.setBegDate(source.getBegDate());
		target.setCipher(source.getCipher());
		target.setEndDate(source.getEndDate());
		target.setName(source.getName());
		target.setNote(source.getNote());

		if (source.getSpecialtyType() != null) {
			target.setSpecialtyTypeId(source.getSpecialtyType().getId());
		}

		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
		}
		
		return target;
	}

	@Override
	public SpecialtyResource convert(final Specialty source) {
		return convert(source, new SpecialtyResource());
	}

}
