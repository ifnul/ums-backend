package org.lnu.is.converter.base;

import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.group.Group;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.user.User;
import org.lnu.is.resource.specialty.SpecialtyResource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InsertConverterTest {

	@Mock
	private Specialty target;
	
	@InjectMocks
	private InsertConverter<SpecialtyResource, Specialty> unit;
	
	@Test
	public void testConvert() throws Exception {
		// Given
		SpecialtyResource source = new SpecialtyResource();
		String groupTitle = "developers";
		Group group = new Group();
		group.setTitle(groupTitle);

		String login = "ivanursul";
		User user = new User();
		user.setLogin(login);

		// When
		unit.convert(source, target);

		// Then
		verify(target).setActual(1);
		verify(target).setStatus(RowStatus.ACTIVE);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testConvertWithOneArgument() throws Exception {
		unit.convert(null);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testConvertAll() throws Exception {
		// Given
		SpecialtyResource source = new SpecialtyResource();
		
		List<SpecialtyResource> list = Arrays.asList(source);
		// When
		unit.convertAll(list);
	}
}
