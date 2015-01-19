package org.lnu.is.converter.person.paper;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.honorstype.HonorType;
import org.lnu.is.domain.papertype.PaperType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.resource.person.paper.PersonPaperResource;

/**
 * Person Paper Resource Converter.
 * @author ivanursul
 *
 */
@ResourceConverter("personPaperResourceConverter")
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
			HonorType honorsType = new HonorType();
			honorsType.setId(source.getHonorsTypeId());
			
			target.setHonorsType(honorsType);
		}
		
		target.setDocSeries(source.getDocSeries());
		target.setDocNum(source.getDocNum());
		target.setDocDate(source.getDocDate());
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
