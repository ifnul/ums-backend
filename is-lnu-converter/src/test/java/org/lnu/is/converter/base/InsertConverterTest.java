package org.lnu.is.converter.base;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.converter.base.InsertConverter;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.resource.specialty.SpecialtyResource;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InsertConverterTest {

	@Mock
	private Specialty target;
	
	private InsertConverter<SpecialtyResource, Specialty> unit = new InsertConverter<SpecialtyResource, Specialty>();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		SpecialtyResource source = new SpecialtyResource();

		// When
		unit.convert(source, target);

		// Then
		verify(target).setActual(1);
		verify(target).setCrtUser("default user");
		verify(target).setCrtUserGroup("default user group");
		verify(target).setStatus(RowStatus.ACTIVE);
	}
}
