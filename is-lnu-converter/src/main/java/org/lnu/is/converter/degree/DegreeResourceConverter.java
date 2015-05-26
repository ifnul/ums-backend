package org.lnu.is.converter.degree;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.degree.Degree;
import org.lnu.is.domain.degree.type.DegreeType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.resource.degree.DegreeResource;

/**
 * Degree  Resource Converter.
 * 
 * @author ivanursul
 *
 */
@Converter("degreeResourceConverter")
public class DegreeResourceConverter extends AbstractConverter<DegreeResource, Degree> {

	@Override
	public Degree convert(final DegreeResource source, final Degree target) {

		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			target.setPerson(person);
		}
		
		if (source.getDegreeTypeId() != null) {
			DegreeType degreeType = new DegreeType();
			degreeType.setId(source.getDegreeTypeId());
			target.setDegreeType(degreeType);
		}
		
		return target;
	}

	@Override
	public Degree convert(final DegreeResource source) {
		return convert(source, new Degree());
	}
}
