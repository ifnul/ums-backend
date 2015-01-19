package org.lnu.is.extractor.partner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.partner.Partner;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PartnerParametersExtractorTest {

	@Mock
	private Dao<Partner, Long> partnerDao;
	
	@InjectMocks
	private PartnerParametersExtractor unit;
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String abbrName = "abbr name";
		Date begDate = new Date();
		String email = "Email";
		Date endDate = new Date();
		String manager = "manager";
		String name = "name";
		Long parentId = 2L;
		String phone = "phone";

		Partner parent = new Partner();
		parent.setId(parentId);
		
		Partner entity = new Partner();
		entity.setAbbrName(abbrName);
		entity.setBegDate(begDate);
		entity.setEmail(email);
		entity.setEndDate(endDate);
		entity.setManager(manager);
		entity.setName(name);
		entity.setParent(parent);
		entity.setPhone(phone);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("abbrName", abbrName);
		expected.put("begDate", begDate);
		expected.put("email", email);
		expected.put("endDate", endDate);
		expected.put("manager", manager);
		expected.put("name", name);
		expected.put("phone", phone);
		expected.put("parent", parent);
		expected.put("status", RowStatus.ACTIVE);
		// When
		when(partnerDao.getEntityById(anyLong())).thenReturn(parent);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(partnerDao).getEntityById(parentId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		Partner entity = new Partner();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
