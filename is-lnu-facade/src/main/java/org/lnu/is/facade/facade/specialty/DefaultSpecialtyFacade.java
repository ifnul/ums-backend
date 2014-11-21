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
	private SpecialtyService specialtyService;

	@Resource(name = "specialtyResourceConverter")
	private Converter<SpecialtyResource, Specialty> specialtyResourceConverter;

	@Resource(name = "specialtyConverter")
	private Converter<Specialty, SpecialtyResource> specialtyConverter;
	
	@Override
	public SpecialtyResource createSpecialty(final SpecialtyResource resource) {
		LOG.info("Creating new specialty, {}", resource);
		
		Specialty specialty = specialtyResourceConverter.convert(resource);
		
		insertConverter.convert(resource, specialty);
		specialty = specialtyService.createSpecialty(specialty);
		
		return specialtyConverter.convert(specialty);
	}

	@Override
	public void updateSpecialty(final Long id, final SpecialtyResource resource) {
		LOG.info("Updating specialty with id:{}, resource", id, resource);
		
		Specialty specialty = specialtyService.getSpecialty(id);
		
		specialtyResourceConverter.convert(resource, specialty);
		updateConverter.convert(resource, specialty);
		
		specialtyService.updateSpecialty(specialty);
	}

	@Override
	public SpecialtyResource getSpecialty(final Long id) {
		LOG.info("Getting specialty with id: {}", id);
		
		Specialty specialty = specialtyService.getSpecialty(id);
		return specialtyConverter.convert(specialty);
	}

	@Override
	public void removeSpecialty(final Long id) {
		LOG.info("Removing specialty:{}", id);
		
		Specialty specialty = specialtyService.getSpecialty(id);
		specialtyService.removeSpecialty(specialty);
	}

	@Override
	public PagedResultResource<SpecialtyResource> getSpecialties(final PagedRequest<SpecialtyResource> request) {
		LOG.info("Getting specialties by paged request: {}", request);

		PagedSearch<Specialty> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(specialtyResourceConverter.convert(request.getResource()));
		
		PagedResult<Specialty> pagedResult = specialtyService.getSpecialties(pagedSearch);

		List<SpecialtyResource> resources = specialtyConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<SpecialtyResource> pagedResultResource = new PagedResultResource<>("/specialties");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
