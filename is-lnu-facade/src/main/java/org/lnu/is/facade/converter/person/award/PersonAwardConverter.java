package org.lnu.is.facade.converter.person.award;

import org.lnu.is.annotations.Converter;
import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.person.award.PersonAwardResource;

/**
 * Person Award Converter.
 * @author ivanursul
 *
 */
@Converter("personAwardConverter")
public class PersonAwardConverter extends AbstractConverter<PersonAward, PersonAwardResource> {

	@Override
	public PersonAwardResource convert(final PersonAward source, final PersonAwardResource target) {
		
		target.setBonus(source.getBonus());
		target.setId(source.getId());
		
		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}
		
		if (source.getPersonPaper() != null) {
			target.setPersonPaperId(source.getPersonPaper().getId());
		}
		
		if (source.getPublicActivityAward() != null) {
			target.setPublicActivityAwardId(source.getPublicActivityAward().getId());
		}
		
		return target;
	}

	@Override
	public PersonAwardResource convert(final PersonAward source) {
		return convert(source, new PersonAwardResource());
	}

}
