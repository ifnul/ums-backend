package org.lnu.is.dao.builder.broadcasting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.broadcasting.BroadcastingMessage;
import org.lnu.is.pagination.MultiplePagedSearch;

public class BroadcastingQueryBuilderTest {

	private BroadcastingQueryBuilder unit = new BroadcastingQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}

	@Test
	public void testConvert() throws Exception {
		// Given
		BroadcastingMessage context = new BroadcastingMessage();
		
		String expected = "SELECT e FROM BroadcastingMessage e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		BroadcastingMessage context = new BroadcastingMessage();
		
		String expected = "SELECT e FROM BroadcastingMessage e WHERE e.status=:status ";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		BroadcastingMessage context = new BroadcastingMessage();
		
		String expected = "SELECT e FROM BroadcastingMessage e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		BroadcastingMessage context = new BroadcastingMessage();
		
		String expected = "SELECT e FROM BroadcastingMessage e ";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testConvertWithParameters() throws Exception {
		// Given
		String topic = "topic";
		String content = "content";

		BroadcastingMessage context = new BroadcastingMessage();
		context.setTopic(topic);
		context.setContent(content);
		
		String expected = "SELECT e FROM BroadcastingMessage e WHERE ( e.topic LIKE CONCAT('%',:topic,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithParametersAndDisabledDeefaultConstaints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String topic = "topic";
		String content = "content";

		BroadcastingMessage context = new BroadcastingMessage();
		context.setTopic(topic);
		context.setContent(content);
		
		String expected = "SELECT e FROM BroadcastingMessage e WHERE ( e.topic LIKE CONCAT('%',:topic,'%') ) ";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
