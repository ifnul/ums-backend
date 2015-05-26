package org.lnu.is.web.rest.controller.benefit;


import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.benefit.BenefitResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.CrudController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Benefit controller. 
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/benefits")
public class BenefitController extends BaseController implements CrudController<BenefitResource> {
	private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);
	
	@Resource(name = "benefitFacade")
	private Facade<BenefitResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	public PagedResultResource<BenefitResource> getPagedResource(final PagedRequest<BenefitResource> request) {
		LOGGER.info("Getting paged result for benefits:{}", request);
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	public BenefitResource getResource(@PathVariable("id") final Long id) {
		LOGGER.info("Getting benefit by id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	public BenefitResource createResource(@Valid @RequestBody final BenefitResource resource) {
		LOGGER.info("Creating new benefit:{}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final BenefitResource resource) {
		LOGGER.info("Updating new resource, id:{}, resource:{}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Benefit updated");
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOGGER.info("Removing benefit:{}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Benefit removed");
	}

}
