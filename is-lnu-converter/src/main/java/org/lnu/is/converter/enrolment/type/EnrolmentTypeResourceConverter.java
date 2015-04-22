package org.lnu.is.converter.enrolment.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.type.EnrolmentType;
import org.lnu.is.resource.enrolment.type.EnrolmentTypeResource;

/**
 * Enrolment Type Resource Converter.
 * 
 * @author kushnir
 *
 */
@Converter("enrolmentTypeResourceConverter")
public class EnrolmentTypeResourceConverter extends AbstractConverter<EnrolmentTypeResource, EnrolmentType> {

	@Override
	public EnrolmentType convert(final EnrolmentTypeResource source, final EnrolmentType target) {
		
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		if (source.getParentId() != null) {
			EnrolmentType parent = new EnrolmentType();
			parent.setId(source.getParentId());
			
			target.setParent(parent);
		}
		return target;
	}

	@Override
	public EnrolmentType convert(final EnrolmentTypeResource source) {
		return convert(source, new EnrolmentType());
	}

}
