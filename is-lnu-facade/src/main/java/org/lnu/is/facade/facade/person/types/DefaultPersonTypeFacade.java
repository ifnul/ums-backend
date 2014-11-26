package org.lnu.is.facade.facade.person.types;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.person.PersonType;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.person.type.PersonTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.person.type.PersonTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Default implementation of person type facade.
 * @author ivanursul
 *
 */
@Transactional
@Facade("personTypeFacade")
public class DefaultPersonTypeFacade extends BaseFacade<PersonTypeResource, PersonType> implements PersonTypeFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultPersonTypeFacade.class);

	@Resource(name = "personTypeService")
	private PersonTypeService service;
	
	@Resource(name = "personTypeResourceConverter")
	private Converter<PersonTypeResource, PersonType> resourceConverter;
	
	@Resource(name = "personTypeConverter")
	private Converter<PersonType, PersonTypeResource> entityConverter;
	
	@Override
	public PagedResultResource<PersonTypeResource> getPersonTypes(final PagedRequest<PersonTypeResource> request) {
		LOG.info("Getting person types by paged request: {}", request);

		PagedSearch<PersonType> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));

		PagedResult<PersonType> pagedResult = service.getPersonTypes(pagedSearch);

		List<PersonTypeResource> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<PersonTypeResource> pagedResultResource = new PagedResultResource<>("/persons/types");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
