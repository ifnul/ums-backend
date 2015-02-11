package org.lnu.is.converter.person.award;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.award.PersonAward;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.domain.publicactivity.PublicActivityAward;
import org.lnu.is.resource.person.award.PersonAwardResource;

/**
 * Person Award Resource Converter.
 * @author ivanursul
 *
 */
@Converter("personAwardResourceConverter")
public class PersonAwardResourceConverter extends AbstractConverter<PersonAwardResource, PersonAward> {

	@Override
	public PersonAward convert(final PersonAwardResource source, final PersonAward target) {
		
		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			
			target.setPerson(person);
		}
		
		if (source.getPersonPaperId() != null) {
			PersonPaper paper = new PersonPaper();
			paper.setId(source.getPersonPaperId());
			
			target.setPersonPaper(paper);
		}
		
		if (source.getPublicActivityAwardId() != null) {
			PublicActivityAward award = new PublicActivityAward();
			award.setId(source.getPublicActivityAwardId());
			
			target.setPublicActivityAward(award);
		}
		
		target.setBonus(source.getBonus());
		
		return target;
	}

	@Override
	public PersonAward convert(final PersonAwardResource source) {
		return convert(source, new PersonAward());
	}

}
