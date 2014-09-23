package com.optigra.funnypictures.facade.converter.picture;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.optigra.funnypictures.facade.resources.picture.PictureResource;
import com.optigra.funnypictures.model.Picture;

@RunWith(MockitoJUnitRunner.class)
public class PictureResourceConverterTest {

	PictureResourceConverter unit = new PictureResourceConverter();

	@Test
	public void testConvertMethod() {

		// Given
		Long id = 1L;
		String name = "Name";
		String url = "Url";

		PictureResource picture1 = new PictureResource();
		picture1.setId(id);
		picture1.setName(name);
		picture1.setUrl(url);

		Picture expectedResource = new Picture();

		expectedResource.setName(name);
		expectedResource.setUrl(url);

		// When
		Picture actualResource = unit.convert(picture1);

		// Then
		assertEquals(expectedResource, actualResource);

	}

	@Test
	public void testConvertToResource() {

		// Given
		Long id = 1L;
		String name = "Name";
		String url = "Url";

		PictureResource picture1 = new PictureResource();
		picture1.setId(id);
		picture1.setName(name);
		picture1.setUrl(url);

		Picture expectedResource = new Picture();

		expectedResource.setName(name);
		expectedResource.setUrl(url);

		// When
		Picture actualResource = new Picture();
		actualResource = unit.convert(picture1, actualResource);

		// Then
		assertEquals(expectedResource, actualResource);

	}

}
