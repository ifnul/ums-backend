package org.lnu.is.facade.facade.addresstype;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.addresstype.AddressTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.addresstype.AddressTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Address Type Facade.
 * 
 * @author ROMA
 *
 */
@Transactional
@Facade("addressTypeFacade")
public class DefaultAddressTypeFacade extends BaseFacade<AddressTypeResource, AddressType> implements AddressTypeFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultAddressTypeFacade.class);

	@Resource(name = "addressTypeConverter")
	private Converter<AddressType, AddressTypeResource> entityConverter;

	@Resource(name = "addressTypeResourceConverter")
	private Converter<AddressTypeResource, AddressType> resourceConverter;

	@Resource(name = "addressTypeService")
	private AddressTypeService service;

	@Override
	public PagedResultResource<AddressTypeResource> getEntities(
			final PagedRequest<AddressTypeResource> request) {
		LOG.info("Getting PagedResultResources for Address Types :", request);

		PagedSearch<AddressType> pagedSearch = pagedRequestConverter .convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));

		PagedResult<AddressType> pagedResult = service.getAddressTypes(pagedSearch);
		List<AddressTypeResource> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<AddressTypeResource> pagedResultResource = new PagedResultResource<>("/addresstypes");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}
}
