package org.lnu.is.converter.person.paper;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.honorstype.HonorType;
import org.lnu.is.domain.paper.type.PaperType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.resource.person.paper.PersonPaperResource;

public class PersonPaperConverterTest {

	private PersonPaperConverter unit = new PersonPaperConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 4L;
		Date docDate = new Date();
		String docIssued = "doc issued";
		String docNum = "doc num";
		String docPin = "doc pint";
		String docSeries = "doc series";
		Integer isChecked = 1;
		Integer isForeign = 0;
		Double mark = 2.0;
		
		Long honorsTypeId = 5L;
		HonorType honorsType = new HonorType();
		honorsType.setId(honorsTypeId);
		
		Long paperTypeId = 6L;
		PaperType paperType = new PaperType();
		paperType.setId(paperTypeId);
		
		Long personId = 7L;
		Person person = new Person();
		person.setId(personId);

		PersonPaper source = new PersonPaper();
		source.setId(id);
		source.setDocDate(docDate);
		source.setDocIssued(docIssued);
		source.setDocNum(docNum);
		source.setDocPin(docPin);
		source.setDocSeries(docSeries);
		source.setIsChecked(isChecked);
		source.setIsForeign(isForeign);
		source.setMark(mark);
		source.setHonorsType(honorsType);
		source.setPaperType(paperType);
		source.setPerson(person);
		
		PersonPaperResource expected = new PersonPaperResource();
		expected.setId(id);
		expected.setDocDate(docDate);
		expected.setDocIssued(docIssued);
		expected.setDocNum(docNum);
		expected.setDocPin(docPin);
		expected.setDocSeries(docSeries);
		expected.setIsChecked(isChecked);
		expected.setIsForeign(isForeign);
		expected.setMark(mark);
		expected.setHonorsTypeId(honorsTypeId);
		expected.setPaperTypeId(paperTypeId);
		expected.setPersonId(personId);
		
		// When
		PersonPaperResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Long id = 4L;
		Date docDate = new Date();
		String docIssued = "doc issued";
		String docNum = "doc num";
		String docPin = "doc pint";
		String docSeries = "doc series";
		Integer isChecked = 1;
		Integer isForeign = 0;
		Double mark = 2.0;
		
		PersonPaper source = new PersonPaper();
		source.setId(id);
		source.setDocDate(docDate);
		source.setDocIssued(docIssued);
		source.setDocNum(docNum);
		source.setDocPin(docPin);
		source.setDocSeries(docSeries);
		source.setIsChecked(isChecked);
		source.setIsForeign(isForeign);
		source.setMark(mark);
		
		
		PersonPaperResource expected = new PersonPaperResource();
		expected.setId(id);
		expected.setDocDate(docDate);
		expected.setDocIssued(docIssued);
		expected.setDocNum(docNum);
		expected.setDocPin(docPin);
		expected.setDocSeries(docSeries);
		expected.setIsChecked(isChecked);
		expected.setIsForeign(isForeign);
		expected.setMark(mark);
		
		// When
		PersonPaperResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}

}
