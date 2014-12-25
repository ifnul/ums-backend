package org.lnu.is.web.rest.controller.benefit.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.benefit.type.BenefitTypeResource;
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
 * Benefit Type Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/benefits/types")
public class BenefitTypeController extends BaseController implements PagedController<BenefitTypeResource> {
	private static final Logger LOGGER = LoggerFactory.getLogger(BenefitTypeController.class);
	
	@Resource(name = "benefitTypeFacade")
	private Facade<BenefitTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Benefit Types")
	public PagedResultResource<BenefitTypeResource> getPagedResource(final PagedRequest<BenefitTypeResource> request) {
		LOGGER.info("Getting paged result for benefit type:{}", request);
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get benefit Type by id")
	public BenefitTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
