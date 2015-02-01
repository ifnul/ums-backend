package org.lnu.is.dao.dao.user.group;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.user.group.UserGroup;
import org.lnu.is.domain.user.group.UserGroupView;
import org.lnu.is.pagination.MultipleSearch;
import org.lnu.is.queries.Query;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultUserGroupDaoTest {

	@Mock
	private QueryBuilder<List<Long>> userGroupViewQueryBuilder;
	
	@Mock
	private PersistenceManager<UserGroup, Long> persistenceManager;
	
	@InjectMocks
	private DefaultUserGroupDao unit;

	@Test
	public void testGetUserGroupViews() throws Exception {
		// Given
		Map<String, Object> parameters = new HashMap<String, Object>();
		Class<UserGroupView> clazz = UserGroupView.class;
		MultipleSearch<UserGroupView> request = new MultipleSearch<UserGroupView>(parameters, clazz);
		List<Long> groupsIds = Collections.emptyList();

		UserGroupView userGroupView1 = new UserGroupView();
		List<UserGroupView> expected = Arrays.asList(userGroupView1);
		String querySql = "query SQL";
		Query<UserGroupView> query = new Query<UserGroupView>(UserGroupView.class, querySql, parameters);

		// When
		when(userGroupViewQueryBuilder.build(anyListOf(Long.class))).thenReturn(querySql);
		when(persistenceManager.getMultipleResult(Matchers.<Query<UserGroupView>>any())).thenReturn(expected);
		List<UserGroupView> actual = unit.getUserGroupViews(request, groupsIds);

		// Then
		verify(persistenceManager).getMultipleResult(query);
		verify(userGroupViewQueryBuilder).build(groupsIds);
		assertEquals(expected, actual);
	}
}
