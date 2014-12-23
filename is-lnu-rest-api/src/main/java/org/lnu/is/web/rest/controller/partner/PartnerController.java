package org.lnu.is.web.rest.controller.partner;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.annotations.Offset;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.partner.PartnerResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
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
public class PartnerController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(PartnerController.class);

	@Resource(name = "partnerFacade")
	private Facade<PartnerResource, Long> facade;

	/**
	 * Method for creating new partner.
	 * @param partnerResource
	 * @return partner with generated identifier.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Partner", position = 1)
	public PartnerResource createPartner(@RequestBody final PartnerResource partnerResource) {
		LOG.info("Creating partner: {}", partnerResource);
		return facade.createResource(partnerResource);
	}

	/**
	 * Method for updating partner.
	 * @param id
	 * @param partnerResource
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update Partner", position = 2)
	public MessageResource updatePartner(@PathVariable("id") final Long id,
			@RequestBody final PartnerResource partnerResource) {
		LOG.info("Updating partner with id: {}, {}", id, partnerResource);
		facade.updateResource(id, partnerResource);
		return new MessageResource(MessageType.INFO, "Partner Updated");
	}

	/**
	 * Method for getting partner by identifier.
	 * @param id
	 * @return partner.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Partner by id", position = 3)
	public PartnerResource getPartner(@PathVariable("id") final Long id) {
		LOG.info("Retrieving partner with id: {}", id);
		return facade.getResource(id);
	}

	/**
	 * Method for removing partner.
	 * @param id
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Partner", position = 4)
	public MessageResource removePartner(@PathVariable("id") final Long id) {
		LOG.info("Removing partner with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Partner removed");
	}

	/**
	 * Method for geting paged result of partners.
	 * 
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Partners", position = 5)
	public PagedResultResource<PartnerResource> getPartners(@Offset final Integer offset,
			@Limit final Integer limit,  final PartnerResource resource) {
		LOG.info("Retrieving PagedResultResource for Partner Resources with offset: {}, limit: {}", offset, limit);
		PagedRequest<PartnerResource> pagedRequest = new PagedRequest<PartnerResource>(resource, offset, limit);
		return facade.getResources(pagedRequest);
	}
}
