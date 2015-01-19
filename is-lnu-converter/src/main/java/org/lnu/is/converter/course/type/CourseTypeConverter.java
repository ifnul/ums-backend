package org.lnu.is.converter.course.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.coursetype.CourseType;
import org.lnu.is.resource.course.type.CourseTypeResource;

/**
 * Course Type Converter.
 * 
 * @author ivanursul
 * 
 */
@Converter("courseTypeConverter")
public class CourseTypeConverter extends AbstractConverter<CourseType, CourseTypeResource> {

	@Override
	public CourseTypeResource convert(final CourseType source, final CourseTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public CourseTypeResource convert(final CourseType source) {
		return convert(source, new CourseTypeResource());
	}

}
