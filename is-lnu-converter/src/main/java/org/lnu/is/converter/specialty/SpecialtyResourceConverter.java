package org.lnu.is.converter.specialty;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.resource.specialty.SpecialtyResource;

/**
 * Converter, that converts from SpecialtyResource to Specialty.
 * 
 * @author ivanursul
 *
 */
@Converter("specialtyResourceConverter")
public class SpecialtyResourceConverter extends AbstractConverter<SpecialtyResource, Specialty> {

	@Override
	public Specialty convert(final SpecialtyResource source, final Specialty target) {

		if (source.getParentId() != null) {
			Specialty parent = new Specialty();
			parent.setId(source.getParentId());
			target.setParent(parent);
		}
		
		if (source.getSpecialtyTypeId() != null) {
			SpecialtyType specialtyType = new SpecialtyType();
			specialtyType.setId(source.getSpecialtyTypeId());
			target.setSpecialtyType(specialtyType);
		}		
		
		target.setAbbrName(source.getAbbrName());
		target.setBegDate(source.getBegDate());
		target.setCipher(source.getCipher());
		target.setEndDate(source.getEndDate());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public Specialty convert(final SpecialtyResource source) {
		return convert(source, new Specialty());
	}

}
