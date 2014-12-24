package org.lnu.is.web.rest.controller.language;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.language.LanguageResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.PagedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class LanguageController extends BaseController implements PagedController<LanguageResource> {
	private static final Logger LOG = LoggerFactory.getLogger(LanguageController.class);

	@Resource(name = "languageFacade")
	private Facade<LanguageResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Languges paged result")
	public PagedResultResource<LanguageResource> getPagedResource(final PagedRequest<LanguageResource> request) {
		LOG.info("Getting PagedResultResource for Languges with  offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get language resource by id")
	public LanguageResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
