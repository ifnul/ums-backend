package org.lnu.is.converter.person.paper;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.honorstype.HonorsType;
import org.lnu.is.domain.papertype.PaperType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.resource.person.paper.PersonPaperResource;

/**
 * Person Paper Resource Converter.
 * @author ivanursul
 *
 */
@Converter("personPaperResourceConverter")
public class PersonPaperResourceConverter extends AbstractConverter<PersonPaperResource, PersonPaper> {

	@Override
	public PersonPaper convert(final PersonPaperResource source, final PersonPaper target) {
		
		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			target.setPerson(person);
		}
		
		if (source.getPaperTypeId() != null) {
			PaperType paperType = new PaperType();
			paperType.setId(source.getPaperTypeId());
			
			target.setPaperType(paperType);
		}
		
		if (source.getHonorsTypeId() != null) {
			HonorsType honorsType = new HonorsType();
			honorsType.setId(source.getHonorsTypeId());
			
			target.setHonorsType(honorsType);
		}
		
		target.setDocSeries(source.getDocSeries());
		target.setDocNum(source.getDocNum());
		target.setDocIssued(source.getDocIssued());
		target.setDocPin(source.getDocPin());
		target.setMark(source.getMark());
		target.setIsChecked(source.getIsChecked());
		target.setIsForeign(source.getIsForeign());
		
		return target;
	}

	@Override
	public PersonPaper convert(final PersonPaperResource source) {
		return convert(source, new PersonPaper());
	}

}
