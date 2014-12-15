package org.lnu.is.web.rest.controller.language;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.language.LanguageResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Controller for managing languges.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/languages")
public class LanguageController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(LanguageController.class);

	@Resource(name = "languageFacade")
	private Facade<LanguageResource, Long> facade;

	/**
	 * Method for getting Job Types.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Languges paged result")
	public PagedResultResource<LanguageResource> getLanguages(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			final LanguageResource resource) {
		LOG.info("Getting PagedResultResource for Languges with  offset: {}, limit: {}", offset, limit);
		PagedRequest<LanguageResource> request = new PagedRequest<LanguageResource>(resource, offset, limit);
		return facade.getResources(request);
	}

}
