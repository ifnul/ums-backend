package org.lnu.is.converter.person.paper;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.person.PersonPaper;
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
