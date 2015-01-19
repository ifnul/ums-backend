package org.lnu.is.dao.builder.benefit;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.benefit.BenefitType;

public class BenefitQueryBuilderTest {

	private BenefitQueryBuilder unit = new BenefitQueryBuilder();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Benefit context = new Benefit();
		
		String expected = "SELECT e FROM Benefit e ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithParameters() throws Exception {
		// Given
		BenefitType benefitType = new BenefitType();
		Benefit parent = new Benefit();

		String abbrName = "fsdsfds";
		String name = "name1";
		Date begDate = new Date();
		Date endDate = new Date();
		String description = "dsafds";

		Benefit context = new Benefit();
		context.setBenefitType(benefitType);
		context.setParent(parent);
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		context.setDescription(description);
		
		
		String expected = "SELECT e FROM Benefit e WHERE e.benefitType = :benefitType OR e.parent = :parent OR e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.description LIKE CONCAT('%',:description,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
