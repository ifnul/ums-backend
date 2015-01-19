package org.lnu.is.converter.person.paper;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.resource.person.paper.PersonPaperResource;

/**
 * Person Paper converter.
 * @author ivanursul
 *
 */
@Converter("personPaperConverter")
public class PersonPaperConverter extends AbstractConverter<PersonPaper, PersonPaperResource> {

	@Override
	public PersonPaperResource convert(final PersonPaper source, final PersonPaperResource target) {
		
		target.setId(source.getId());
		target.setDocDate(source.getDocDate());
		target.setDocIssued(source.getDocIssued());
		target.setDocNum(source.getDocNum());
		target.setDocPin(source.getDocPin());
		target.setDocSeries(source.getDocSeries());
		target.setIsChecked(source.getIsChecked());
		target.setIsForeign(source.getIsForeign());
		target.setMark(source.getMark());
		
		if (source.getHonorsType() != null) {
			target.setHonorsTypeId(source.getHonorsType().getId());
		}
		
		if (source.getPaperType() != null) {
			target.setPaperTypeId(source.getPaperType().getId());
		}

		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}
		
		return target;
	}

	@Override
	public PersonPaperResource convert(final PersonPaper source) {
		return convert(source, new PersonPaperResource());
	}

}
