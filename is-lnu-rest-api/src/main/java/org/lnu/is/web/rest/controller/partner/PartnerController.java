package org.lnu.is.web.rest.controller.partner;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.partner.PartnerResource;
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

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Controller for handling .
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/partners")
public class PartnerController extends BaseController implements CrudController<PartnerResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PartnerController.class);

	@Resource(name = "partnerFacade")
	private Facade<PartnerResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Partner", position = 1)
	public PartnerResource createResource(@RequestBody final PartnerResource partnerResource) {
		LOG.info("Creating partner: {}", partnerResource);
		return facade.createResource(partnerResource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update Partner", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@RequestBody final PartnerResource partnerResource) {
		LOG.info("Updating partner with id: {}, {}", id, partnerResource);
		facade.updateResource(id, partnerResource);
		return new MessageResource(MessageType.INFO, "Partner Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Partner by id", position = 3)
	public PartnerResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving partner with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Partner", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing partner with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Partner removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Partners", position = 5)
	public PagedResultResource<PartnerResource> getPagedResource(final PagedRequest<PartnerResource> request) {
		LOG.info("Retrieving PagedResultResource for Partner Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
