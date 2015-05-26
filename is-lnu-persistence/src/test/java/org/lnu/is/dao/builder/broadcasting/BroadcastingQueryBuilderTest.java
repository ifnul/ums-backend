package org.lnu.is.dao.builder.broadcasting;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.broadcasting.BroadcastingMessage;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

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
	public void testConvertWithOrderBy() throws Exception {
		// Given
		BroadcastingMessage context = new BroadcastingMessage();
		
		OrderBy orderBy1 = new OrderBy("content", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("topic", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BroadcastingMessage e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.content ASC, e.topic DESC";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testConvertWithDisabledSecurityConstraintWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		BroadcastingMessage context = new BroadcastingMessage();
		
		OrderBy orderBy1 = new OrderBy("content", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("topic", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BroadcastingMessage e WHERE e.status=:status ORDER BY e.content ASC, e.topic DESC";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testConvertWithDisabledStatusConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		BroadcastingMessage context = new BroadcastingMessage();
		
		OrderBy orderBy1 = new OrderBy("content", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("topic", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BroadcastingMessage e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.content ASC, e.topic DESC";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testConvertWithDisabledDefaultConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		BroadcastingMessage context = new BroadcastingMessage();
		
		OrderBy orderBy1 = new OrderBy("content", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("topic", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BroadcastingMessage e ORDER BY e.content ASC, e.topic DESC";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testConvertWithParametersWithOrderBy() throws Exception {
		// Given
		String topic = "topic";
		String content = "content";

		BroadcastingMessage context = new BroadcastingMessage();
		context.setTopic(topic);
		context.setContent(content);
		
		OrderBy orderBy1 = new OrderBy("content", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("topic", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BroadcastingMessage e WHERE ( e.topic LIKE CONCAT('%',:topic,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.content ASC, e.topic DESC";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	
	@Test
	public void testConvertWithParametersAndDisabledDeefaultConstaintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String topic = "topic";
		String content = "content";

		BroadcastingMessage context = new BroadcastingMessage();
		context.setTopic(topic);
		context.setContent(content);
		
		OrderBy orderBy1 = new OrderBy("content", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("topic", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BroadcastingMessage e WHERE ( e.topic LIKE CONCAT('%',:topic,'%') ) ORDER BY e.content ASC, e.topic DESC";
		MultiplePagedSearch<BroadcastingMessage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
