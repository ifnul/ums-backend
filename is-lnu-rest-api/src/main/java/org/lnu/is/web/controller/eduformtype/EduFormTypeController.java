package org.lnu.is.web.controller.eduformtype;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.eduformtype.EduFormTypeFacade;
import org.lnu.is.facade.resource.eduformtype.EduFormTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Edu Form Type Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/eduformtypes")
@Api(value = "Education Form Types", description = "Edu Form Type")
public class EduFormTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(EduFormTypeController.class);
	
	@Resource(name = "eduFormTypeFacade")
	private EduFormTypeFacade eduFormTypeFacade;
	
	/**
	 * Method for getting paged result.
	 * @author ivanursul
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Education Form Types")
	public PagedResultResource<EduFormTypeResource> getEduFormTypes(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "38") final Integer limit,
			final EduFormTypeResource resource) {
		LOG.info("Getting Paged Result of  Edu Form Type with  offset: {}, limit: {}", offset, limit);
		PagedRequest<EduFormTypeResource> request = new PagedRequest<EduFormTypeResource>(resource, offset, limit);
		return eduFormTypeFacade.getEduFormTypes(request);
	}
}
