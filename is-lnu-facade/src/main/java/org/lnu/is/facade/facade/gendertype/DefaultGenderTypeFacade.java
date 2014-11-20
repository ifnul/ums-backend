package org.lnu.is.facade.facade.gendertype;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.gendertype.GenderTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.gendertype.GenderTypeService;
import org.springframework.transaction.annotation.Transactional;

/**
 * Gender Type Facade.
 * 
 * @author kushnir
 *
 */
@Transactional
@Facade("genderTypeFacade")
public class DefaultGenderTypeFacade implements GenderTypeFacade {

	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest<GenderTypeResource>, PagedSearch<GenderType>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;

	@Resource(name = "genderTypeConverter")
	private Converter<GenderType, GenderTypeResource> genderTypeConverter;

	@Resource(name = "genderTypeResourceConverter")
	private Converter<GenderTypeResource, GenderType> genderTypeResourceConverter;

	@Resource(name = "genderTypeService")
	private GenderTypeService genderTypeService;

	@Override
	public PagedResultResource<GenderTypeResource> getGenderTypes(final PagedRequest<GenderTypeResource> request) {

		PagedSearch<GenderType> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(genderTypeResourceConverter.convert(request.getResource()));

		PagedResult<GenderType> pagedResult = genderTypeService.getGenderTypes(pagedSearch);
		List<GenderTypeResource> resources = genderTypeConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<GenderTypeResource> pagedResultResource = new PagedResultResource<>("/gendertypes");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
