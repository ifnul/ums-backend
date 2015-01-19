package org.lnu.is.dao.builder.person.paper;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.honorstype.HonorType;
import org.lnu.is.domain.papertype.PaperType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonPaper;

public class PersonPaperQueryBuilderTest {

	private PersonPaperQueryBuilder unit = new PersonPaperQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		PersonPaper context = new PersonPaper();
		String expectedQuery = "SELECT e FROM PersonPaper e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Person person = new Person();
		PaperType paperType = new PaperType();
		HonorType honorsType = new HonorType();
		Date docDate = new Date();
		String docSeries = "dfds";
		String docNum = "fdssd";
		String docIssued = "fdssd";
		String docPin = "asfas xc";
		Integer isChecked = 1;
		Integer isForeign = 2;
		Double mark = 4.5;

		PersonPaper context = new PersonPaper();
		context.setPerson(person);
		context.setPaperType(paperType);
		context.setHonorsType(honorsType);
		context.setDocDate(docDate);
		context.setDocSeries(docSeries);
		context.setDocNum(docNum);
		context.setDocIssued(docIssued);
		context.setDocPin(docPin);
		context.setMark(mark);
		context.setIsChecked(isChecked);
		context.setIsForeign(isForeign);
		
		String expectedQuery = "SELECT e FROM PersonPaper e WHERE ( e.person = :person OR e.paperType = :paperType OR e.honorsType = :honorsType OR e.docDate = :docDate OR e.docSeries LIKE CONCAT('%',:docSeries,'%') OR e.docNum LIKE CONCAT('%',:docNum,'%') OR e.docIssued = :docIssued OR e.docPin = :docPin OR e.mark = :mark OR e.isChecked = :isChecked OR e.isForeign = :isForeign ) AND e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
