package org.lnu.is.converter.course.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.coursetype.CourseType;
import org.lnu.is.resource.course.type.CourseTypeResource;

/**
 * Course Type Resource Converter.
 * 
 * @author ivanursul
 *
 */
@Converter("courseTypeResourceConverter")
public class CourseTypeResourceConverter extends AbstractConverter<CourseTypeResource, CourseType> {

	@Override
	public CourseType convert(final CourseTypeResource source, final CourseType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public CourseType convert(final CourseTypeResource source) {
		return convert(source, new CourseType());
	}
}
