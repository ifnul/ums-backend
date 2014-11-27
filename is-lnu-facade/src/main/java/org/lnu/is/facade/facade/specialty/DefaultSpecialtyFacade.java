package org.lnu.is.facade.facade.specialty;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specialty.SpecialtyResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.specialty.SpecialtyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Default implementation of specialty facade.
 * @author ivanursul
 *
 */
@Transactional
@Facade("specialtyFacade")
public class DefaultSpecialtyFacade extends BaseFacade<SpecialtyResource, Specialty> implements SpecialtyFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultSpecialtyFacade.class);
	
	@Resource(name = "specialtyService")
	private SpecialtyService service;

	@Resource(name = "specialtyResourceConverter")
	private Converter<SpecialtyResource, Specialty> resourceConverter;

	@Resource(name = "specialtyConverter")
	private Converter<Specialty, SpecialtyResource> entityConverter;
	
	@Override
	public SpecialtyResource createEntity(final SpecialtyResource resource) {
		LOG.info("Creating new specialty, {}", resource);
		
		Specialty specialty = resourceConverter.convert(resource);
		
		insertConverter.convert(resource, specialty);
		specialty = service.createSpecialty(specialty);
		
		return entityConverter.convert(specialty);
	}

	@Override
	public void updateEntity(final Long id, final SpecialtyResource resource) {
		LOG.info("Updating specialty with id:{}, resource", id, resource);
		
		Specialty specialty = service.getSpecialty(id);
		
		resourceConverter.convert(resource, specialty);
		updateConverter.convert(resource, specialty);
		
		service.updateSpecialty(specialty);
	}

	@Override
	public SpecialtyResource getEntity(final Long id) {
		LOG.info("Getting specialty with id: {}", id);
		
		Specialty specialty = service.getSpecialty(id);
		return entityConverter.convert(specialty);
	}

	@Override
	public void removeEntity(final Long id) {
		LOG.info("Removing specialty:{}", id);
		
		Specialty specialty = service.getSpecialty(id);
		service.removeSpecialty(specialty);
	}

	@Override
	public PagedResultResource<SpecialtyResource> getEntities(final PagedRequest<SpecialtyResource> request) {
		LOG.info("Getting specialties by paged request: {}", request);

		PagedSearch<Specialty> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));
		
		PagedResult<Specialty> pagedResult = service.getSpecialties(pagedSearch);

		List<SpecialtyResource> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<SpecialtyResource> pagedResultResource = new PagedResultResource<>("/specialties");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
