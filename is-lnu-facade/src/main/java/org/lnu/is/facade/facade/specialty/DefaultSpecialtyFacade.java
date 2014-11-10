package org.lnu.is.facade.facade.specialty;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
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
public class DefaultSpecialtyFacade implements SpecialtyFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultSpecialtyFacade.class);
	
	@Resource(name = "specialtyService")
	private SpecialtyService specialtyService;

	@Resource(name = "insertConverter")
	private Converter<SpecialtyResource, Specialty> insertConverter;

	@Resource(name = "updateConverter")
	private Converter<SpecialtyResource, Specialty> updateConverter;
	
	@Resource(name = "specialtyResourceConverter")
	private Converter<SpecialtyResource, Specialty> specialtyResourceConverter;

	@Resource(name = "specialtyConverter")
	private Converter<Specialty, SpecialtyResource> specialtyConverter;
	
	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest<SpecialtyResource>, PagedSearch<Specialty>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@Override
	public SpecialtyResource createSpecialty(final SpecialtyResource specialtyResource) {
		Specialty specialty = specialtyResourceConverter.convert(specialtyResource);
		insertConverter.convert(specialtyResource, specialty);
		specialty = specialtyService.createSpecialty(specialty);
		return specialtyConverter.convert(specialty);
	}

	@Override
	public void updateSpecialty(final Long id, final SpecialtyResource specialtyResource) {
		Specialty specialty = specialtyService.getSpecialty(id);
		
		specialtyResourceConverter.convert(specialtyResource, specialty);
		updateConverter.convert(specialtyResource, specialty);
		
		specialtyService.updateSpecialty(specialty);
	}

	@Override
	public SpecialtyResource getSpecialty(final Long id) {
		Specialty specialty = specialtyService.getSpecialty(id);
		return specialtyConverter.convert(specialty);
	}

	@Override
	public void removeSpecialty(final Long id) {
		Specialty specialty = specialtyService.getSpecialty(id);
		specialtyService.removeSpecialty(specialty);
	}

	@Override
	public PagedResultResource<SpecialtyResource> getSpecialties(final PagedRequest<SpecialtyResource> pagedRequest) {
		LOG.info("Get specialties by paged request: {}", pagedRequest);

		PagedSearch<Specialty> pagedSearch = pagedRequestConverter.convert(pagedRequest);

		PagedResult<Specialty> pagedResult = specialtyService.getSpecialties(pagedSearch);

		List<SpecialtyResource> resources = specialtyConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<SpecialtyResource> pagedResultResource = new PagedResultResource<>("/specialties");
		pagedResultResource.setEntities(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
