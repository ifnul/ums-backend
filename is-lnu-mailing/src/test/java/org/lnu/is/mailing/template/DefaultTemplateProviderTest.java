package org.lnu.is.mailing.template;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.mailing.exception.MailException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

@RunWith(MockitoJUnitRunner.class)
public class DefaultTemplateProviderTest {

	@Mock
	private Handlebars handlebars;
	
	@Mock
	private Template template;

	@InjectMocks
	private DefaultTemplateProvider unit;

	
	@Test
	public void testProcess() throws Exception {
		// Given
		String templateId = "templateId";
		Object data = "data";
		String renderedHtml = "<html>name</html>";

		// When
		when(handlebars.compile(anyString())).thenReturn(template);
		when(template.apply(any())).thenReturn(renderedHtml);
		unit.process(templateId, data);

		// Then
		verify(template).apply(data);
		verify(handlebars).compile(templateId);
	}

	@Test(expected = MailException.class)
	public void testProcessWithException() throws Exception {
		// Given
		String templateId = "templateId";
		Object data = "data";
		
		// When
		doThrow(IOException.class).when(handlebars).compile(anyString());
		unit.process(templateId, data);
		
		// Then
		verify(handlebars).compile(templateId);
	}
}
