package org.lnu.is.facade.converter.partner;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.facade.resource.partner.PartnerResource;

public class PartnerConverterTest {

	private PartnerConverter unit = new PartnerConverter();
	
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
		
		Partner source = new Partner();
		source.setAbbrName(abbrName);
		source.setBegDate(begDate);
		source.setEmail(email);
		source.setEndDate(endDate);
		source.setId(id);
		source.setManager(manager);
		source.setName(name);
		source.setParent(parent);
		source.setPhone(phone);
		
		PartnerResource expected = new PartnerResource();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setEmail(email);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setManager(manager);
		expected.setName(name);
		expected.setParentId(parentId);
		expected.setPhone(phone);
		
		// When
		PartnerResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
