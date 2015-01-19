package org.lnu.is.dao.builder.partner;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.partner.Partner;

public class PartnerQueryBuilderTest {

	private PartnerQueryBuilder unit = new PartnerQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Partner context = new Partner();
		
		String expected = "SELECT e FROM Partner e WHERE e.status=:status ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Partner parent = new Partner();
		String abbrName = "abbr name";
		String name = "fdsfds";
		String manager = "fdsfsd";
		String phone = "fdfds";
		String email = "fdsfds";
		Date begDate = new Date();
		Date endDate = new Date();

		Partner context = new Partner();
		context.setAbbrName(abbrName);
		context.setParent(parent);
		context.setName(name);
		context.setManager(manager);
		context.setPhone(phone);
		context.setEmail(email);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		
		String expected = "SELECT e FROM Partner e WHERE ( e.parent = :parent OR e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.manager LIKE CONCAT('%',:manager,'%') OR e.phone LIKE CONCAT('%',:phone,'%') OR e.email LIKE CONCAT('%',:email,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate ) AND e.status=:status ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
