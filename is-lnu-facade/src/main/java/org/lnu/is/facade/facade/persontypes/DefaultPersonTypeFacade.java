package org.lnu.is.facade.facade.persontypes;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.persontype.PersonType;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.persontype.PersonTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.persontype.PersonTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default implementation of person type facade.
 * @author ivanursul
 *
 */
@Facade("personTypeFacade")
public class DefaultPersonTypeFacade implements PersonTypeFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultPersonTypeFacade.class);

	@Resource(name = "personTypeService")
	private PersonTypeService personTypeService;
	
	@Resource(name = "personTypeResourceConverter")
	private Converter<PersonTypeResource, PersonType> personTypeResourceConverter;
	
	@Resource(name = "personTypeConverter")
	private Converter<PersonType, PersonTypeResource> personTypeConverter;
	
	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest<PersonTypeResource>, PagedSearch<PersonType>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@Override
	public PagedResultResource<PersonTypeResource> getPersonTypes(final PagedRequest<PersonTypeResource> pagedRequest) {
		LOG.info("Getting person types by paged request: {}", pagedRequest);

		PagedSearch<PersonType> pagedSearch = pagedRequestConverter.convert(pagedRequest);
		pagedSearch.setEntity(personTypeResourceConverter.convert(pagedRequest.getResource()));

		PagedResult<PersonType> pagedResult = personTypeService.getPersonTypes(pagedSearch);

		List<PersonTypeResource> resources = personTypeConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<PersonTypeResource> pagedResultResource = new PagedResultResource<>("/persons/types");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
