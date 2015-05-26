package org.lnu.is.converter.person.paper;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.honors.type.HonorType;
import org.lnu.is.domain.paper.type.PaperType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.resource.person.paper.PersonPaperResource;

public class PersonPaperResourceConverterTest {

	private PersonPaperResourceConverter unit = new PersonPaperResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long honorsTypeId = 1L;
		HonorType honorsType = new HonorType();
		honorsType.setId(honorsTypeId);
		
		Long paperTypeId = 2L;
		PaperType paperType = new PaperType();
		paperType.setId(paperTypeId);
		
		Long personId = 3L;
		Person person = new Person();
		person.setId(personId);
		
		Long id = 4L;
		Date docDate = new Date();
		String docIssued = "doc issued";
		String docNum = "doc num";
		String docPin = "doc pint";
		String docSeries = "doc series";
		Integer isChecked = 1;
		Integer isForeign = 0;
		Double mark = 2.0;

		PersonPaper expected = new PersonPaper();
		expected.setDocDate(docDate);
		expected.setDocIssued(docIssued);
		expected.setDocNum(docNum);
		expected.setDocPin(docPin);
		expected.setDocSeries(docSeries);
		expected.setIsChecked(isChecked);
		expected.setIsForeign(isForeign);
		expected.setMark(mark);
		expected.setHonorsType(honorsType);
		expected.setPaperType(paperType);
		expected.setPerson(person);
		
		PersonPaperResource source = new PersonPaperResource();
		source.setId(id);
		source.setDocDate(docDate);
		source.setDocIssued(docIssued);
		source.setDocNum(docNum);
		source.setDocPin(docPin);
		source.setDocSeries(docSeries);
		source.setIsChecked(isChecked);
		source.setIsForeign(isForeign);
		source.setMark(mark);
		source.setHonorsTypeId(honorsTypeId);
		source.setPaperTypeId(paperTypeId);
		source.setPersonId(personId);
		
		// When
		PersonPaper actual = unit.convert(source);

		// Then
		assertEquals(expected.toString(), actual.toString());
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
		
		PersonPaper expected = new PersonPaper();
		expected.setDocDate(docDate);
		expected.setDocIssued(docIssued);
		expected.setDocNum(docNum);
		expected.setDocPin(docPin);
		expected.setDocSeries(docSeries);
		expected.setIsChecked(isChecked);
		expected.setIsForeign(isForeign);
		expected.setMark(mark);
		
		PersonPaperResource source = new PersonPaperResource();
		source.setId(id);
		source.setDocDate(docDate);
		source.setDocIssued(docIssued);
		source.setDocNum(docNum);
		source.setDocPin(docPin);
		source.setDocSeries(docSeries);
		source.setIsChecked(isChecked);
		source.setIsForeign(isForeign);
		source.setMark(mark);
		
		// When
		PersonPaper actual = unit.convert(source);
		
		// Then
		assertEquals(expected.toString(), actual.toString());
	}
}
