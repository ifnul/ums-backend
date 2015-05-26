package org.lnu.is.service.user.group;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.user.group.UserGroupDao;
import org.lnu.is.domain.user.group.UserGroupView;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.MultipleSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultUserGroupServiceTest {

	@Mock
	private ParametersExtractor<List<Long>> userGroupViewsParametersExtractor;
	
	@Mock
	private UserGroupDao dao;
	
	@InjectMocks
	private DefaultUserGroupService unit;
	
	@Test
	public void testGetUserGroupViews() throws Exception {
		// Given
		Map<String, Object> parameters = new HashMap<String, Object>();
		Long group1 = 1L;
		List<Long> groupsIds = Arrays.asList(group1);

		UserGroupView userGroupView1 = new UserGroupView();
		List<UserGroupView> expected = Arrays.asList(userGroupView1);
		
		MultipleSearch<UserGroupView> request = new MultipleSearch<UserGroupView>(parameters, UserGroupView.class);
		
		// When
		when(userGroupViewsParametersExtractor.getParameters(anyListOf(Long.class))).thenReturn(parameters);
		when(dao.getUserGroupViews(Matchers.<MultipleSearch<UserGroupView>>any(), anyListOf(Long.class))).thenReturn(expected);
		List<UserGroupView> actual = unit.getUserGroupsView(groupsIds);

		// Then
		verify(userGroupViewsParametersExtractor).getParameters(groupsIds);
		verify(dao).getUserGroupViews(request, groupsIds);
		assertEquals(expected, actual);
	}
}
