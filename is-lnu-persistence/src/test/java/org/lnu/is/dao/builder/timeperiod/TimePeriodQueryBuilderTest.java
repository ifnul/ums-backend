package org.lnu.is.dao.builder.timeperiod;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.domain.timeperiod.TimePeriodType;

public class TimePeriodQueryBuilderTest {

	private TimePeriodQueryBuilder unit = new TimePeriodQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		TimePeriodType timePeriodType = new TimePeriodType();
		Integer numValue = 2;

		TimePeriod context = new TimePeriod();
		context.setBegDate(new Date());
		context.setTimePeriodType(timePeriodType);
		context.setNumValue(numValue);

		String expectedQuery = "SELECT t FROM TimePeriod t WHERE t.timePeriodType = :timePeriodType OR t.numValue = :numValue OR t.begDate <= :begDate OR t.endDate >= :endDate";
		
		// When
		String actualQuery = unit.build(context);

		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
