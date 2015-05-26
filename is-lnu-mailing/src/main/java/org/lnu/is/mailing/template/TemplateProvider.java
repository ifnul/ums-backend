package org.lnu.is.mailing.template;

/**
 * Interface for describing template provider.
 * @author ivanursul
 *
 */
public interface TemplateProvider {

	/**
	 * Single method for processing html template.
	 * @param templateId templateId
	 * @param data data
	 * @return rendered email.
	 */
	String process(String templateId, Object data);

}
