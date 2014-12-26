package org.lnu.is.facade.converter.partner;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.resource.partner.PartnerResource;

public class PartnerResourceConverterTest {

	private PartnerResourceConverter unit = new PartnerResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String abbrName = "abbr name";
		Date begDate = new Date();
		String email = "Email";
		Date endDate = new Date();
		Long id = 1L;
		String manager = "manager";
		String name = "name";
		Long parentId = 2L;
		String phone = "phone";

		Partner parent = new Partner();
		parent.setId(parentId);
		
		Partner expected = new Partner();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setEmail(email);
		expected.setEndDate(endDate);
		expected.setManager(manager);
		expected.setName(name);
		expected.setParent(parent);
		expected.setPhone(phone);
		
		PartnerResource source = new PartnerResource();
		source.setAbbrName(abbrName);
		source.setBegDate(begDate);
		source.setEmail(email);
		source.setEndDate(endDate);
		source.setId(id);
		source.setManager(manager);
		source.setName(name);
		source.setParentId(parentId);
		source.setPhone(phone);
		
		// When
		Partner actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
