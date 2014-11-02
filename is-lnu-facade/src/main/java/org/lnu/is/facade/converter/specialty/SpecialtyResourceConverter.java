package org.lnu.is.facade.converter.specialty;

import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specialtype.SpecialtyType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.specialty.SpecialtyResource;

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

		Specialty parent = new Specialty();
		parent.setId(source.getParentId());
		
		SpecialtyType specialtyType = new SpecialtyType();
		specialtyType.setId(source.getSpecialtyTypeId());
		
		target.setAbbrName(source.getAbbrName());
		target.setBegDate(source.getBegDate());
		target.setCipher(source.getCipher());
		target.setEndDate(source.getEndDate());
		target.setName(source.getName());
		target.setParent(parent);
		target.setSpecialtyType(specialtyType);
		target.setNote(source.getNote());
		
		return target;
	}

	@Override
	public Specialty convert(final SpecialtyResource source) {
		return convert(source, new Specialty());
	}

}
