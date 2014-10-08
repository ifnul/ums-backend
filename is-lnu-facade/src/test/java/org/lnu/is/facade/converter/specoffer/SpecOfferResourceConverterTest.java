package org.lnu.is.facade.converter.specoffer;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.resources.specoffer.SpecOfferResource;

public class SpecOfferResourceConverterTest {

	private SpecOfferResourceConverter unit = new SpecOfferResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
    	String note = "Note";
    	Integer licCount = 24;
    	Long eduFormTypeId = 1L;
    	String docNum = "docNum";
    	Long departmentId = 23L;
    	
    	SpecOfferResource source = new SpecOfferResource();
    	source.setBegDate(new Date());
    	source.setEndDate(new Date());
		source.setDepartmentId(departmentId);
		source.setDocNum(docNum);
		source.setEduFormTypeId(eduFormTypeId);
		source.setLicCount(licCount);
		source.setNote(note);

		SpecOffer expected = new SpecOffer();
		
		// When
		SpecOffer actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
