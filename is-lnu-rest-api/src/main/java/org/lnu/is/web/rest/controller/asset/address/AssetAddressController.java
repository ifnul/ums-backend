package org.lnu.is.web.rest.controller.asset.address;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.asset.address.AssetAddressResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
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
 * AssetAddress Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping(value = "/assets")
public class AssetAddressController extends BaseController implements CrudController<AssetAddressResource> {
	private static final Logger LOG = LoggerFactory.getLogger(AssetAddressController.class);
	
	@Resource(name = "assetAddressFacade")
	private Facade<AssetAddressResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{assetId}/addresses", method = RequestMethod.POST)
	public AssetAddressResource createResource(@Valid @RequestBody final AssetAddressResource resource) {
		LOG.info("Creating asset address: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{assetId}/addresses/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final AssetAddressResource resource) {
		LOG.info("Updated asset address with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "AssetAddress Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{assetId}/addresses/{id}", method = RequestMethod.GET)
	public AssetAddressResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving asset address with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{assetId}/addresses/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing asset address with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "AssetAddress removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = { "/{assetId}/addresses", "/addresses" }, method = RequestMethod.GET)
	public PagedResultResource<AssetAddressResource> getPagedResource(final PagedRequest<AssetAddressResource> request) {
		LOG.info("Retrieving PagedResultResource for Asset Address Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}	
}
