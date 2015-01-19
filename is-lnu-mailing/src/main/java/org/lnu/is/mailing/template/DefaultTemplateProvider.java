package org.lnu.is.mailing.template;

import java.io.IOException;

import javax.annotation.Resource;

import org.lnu.is.mailing.exception.MailException;
import org.springframework.stereotype.Component;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

/**
 * Default Template Provider.
 * @author ivanursul
 *
 */
@Component("templateProvider")
public class DefaultTemplateProvider implements TemplateProvider {

	@Resource(name = "handlebars")
	private Handlebars handlebars;
	
	@Override
	public String process(final String templateId, final Object data) {
		String renderedTemplate;
		try {
			Template template = handlebars.compile(templateId);
			renderedTemplate = template.apply(data);
		} catch (IOException e) {
			throw new MailException("Exception occurs", e);
		}
		
		return renderedTemplate;
	}

}
