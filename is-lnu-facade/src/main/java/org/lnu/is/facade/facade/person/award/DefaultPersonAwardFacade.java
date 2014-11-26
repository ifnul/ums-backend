package org.lnu.is.facade.facade.person.award;

import java.text.MessageFormat;
import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.person.award.PersonAwardResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.person.award.PersonAwardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default implementation of person award facade.
 * @author ivanursul
 *
 */
@Facade("personAwardFacade")
public class DefaultPersonAwardFacade extends BaseFacade<PersonAwardResource, PersonAward> implements PersonAwardFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultPersonAwardFacade.class);
	
	@Resource(name = "personAwardResourceConverter")
	private Converter<PersonAwardResource, PersonAward> resourceConverter;
	
	@Resource(name = "personAwardConverter")
	private Converter<PersonAward, PersonAwardResource> entityConverter;
	
	@Resource(name = "personAwardService")
	private PersonAwardService service;
	
	@Override
	public PersonAwardResource createAward(final PersonAwardResource resource) {
		LOG.info("Creating award: {}", resource);
		PersonAward award = new PersonAward();
				
		resourceConverter.convert(resource, award);
		insertConverter.convert(resource, award);
		service.createAward(award);
		
		return entityConverter.convert(award);
	}

	@Override
	public void updateAward(final Long personAwardId, final PersonAwardResource resource) {
		LOG.info("Updating award({}): {}", personAwardId, resource);
		
		PersonAward award = service.getAward(personAwardId);
		resourceConverter.convert(resource, award);
		updateConverter.convert(resource, award);
		
		service.updateAward(award);
	}

	@Override
	public PersonAwardResource getAward(final Long personAwardId) {
		PersonAward award = service.getAward(personAwardId);
		return entityConverter.convert(award);
	}

	@Override
	public void removeAward(final Long personAwardId) {
		PersonAward award = service.getAward(personAwardId);
		service.removeAward(award);
	}

	@Override
	public PagedResultResource<PersonAwardResource> getAwards(final PagedRequest<PersonAwardResource> request) {
		LOG.info("Get person awards by paged request: {}", request);

		PagedSearch<PersonAward> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));

		PagedResult<PersonAward> pagedResult = service.getAwards(pagedSearch);

		List<PersonAwardResource> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<PersonAwardResource> pagedResultResource = new PagedResultResource<>(MessageFormat.format("/persons/{0}/awards", request.getResource().getPersonId()));
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
