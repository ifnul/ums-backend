package org.lnu.is.web.filter.logging;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ResettableStreamHttpServletRequestTest {

	@Mock
	private HttpServletRequest request;

	@Test
	public void testGetInputStream() throws Exception {
		// Given
		
		String message = "message";
		ResettableStreamHttpServletRequest unit = new ResettableStreamHttpServletRequest(request);
		InputStream is = new ByteArrayInputStream(message.getBytes());
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		
		// When
		when(request.getReader()).thenReturn(reader);
		unit.setRawData(message.getBytes());
		ServletInputStream actual = unit.getInputStream();

		// Then
		assertNotNull(actual);
	}

	@Test
	public void testGetReader() throws Exception {
		// Given
		
		String message = "message";
		ResettableStreamHttpServletRequest unit = new ResettableStreamHttpServletRequest(request);
		InputStream is = new ByteArrayInputStream(message.getBytes());
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		
		// When
		when(request.getReader()).thenReturn(reader);
		unit.setRawData(message.getBytes());
		Reader actual = unit.getReader();
		
		// Then
		assertNotNull(actual);
	}

	@Test
	public void testGetInputStreamWithRawData() throws Exception {
		// Given
		
		String message = "message";
		ResettableStreamHttpServletRequest unit = new ResettableStreamHttpServletRequest(request);
		InputStream is = new ByteArrayInputStream(message.getBytes());
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		
		// When
		when(request.getReader()).thenReturn(reader);
		ServletInputStream actual = unit.getInputStream();
		
		// Then
		assertNotNull(actual);
	}
}
