package org.lnu.is.facade.facade.enrolmentstatustype;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.enrolmentstatustype.EnrolmentStatusType;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.enrolmentstatustype.EnrolmentStatusTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.enrolmentstatustype.EnrolmentStatusTypeService;

/**
 * Enrolment Status Type Facade.
 * 
 * @author kushnir
 *
 */

@Facade("enrolmentStatusTypeFacade")
public class DefaultEnrolmentStatusTypeFacade implements
		EnrolmentStatusTypeFacade {

	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest<EnrolmentStatusTypeResource>, PagedSearch<EnrolmentStatusType>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;

	@Resource(name = "enrolmentStatusTypeConverter")
	private Converter<EnrolmentStatusType, EnrolmentStatusTypeResource> enrolmentStatusTypeConverter;

	@Resource(name = "enrolmentStatusTypeResourceConverter")
	private Converter<EnrolmentStatusTypeResource, EnrolmentStatusType> enrolmentStatusTypeResourceConverter;

	@Resource(name = "enrolmentStatusTypeService")
	private EnrolmentStatusTypeService enrolmentStatusTypeService;

	@Override
	public PagedResultResource<EnrolmentStatusTypeResource> getEnrolmentStatusTypes(
			final PagedRequest<EnrolmentStatusTypeResource> request) {

		PagedSearch<EnrolmentStatusType> pagedSearch = pagedRequestConverter
				.convert(request);
		pagedSearch.setEntity(enrolmentStatusTypeResourceConverter
				.convert(request.getResource()));

		PagedResult<EnrolmentStatusType> pagedResult = enrolmentStatusTypeService
				.getEnrolmentStatusTypes(pagedSearch);

		List<EnrolmentStatusTypeResource> resources = enrolmentStatusTypeConverter
				.convertAll(pagedResult.getEntities());

		PagedResultResource<EnrolmentStatusTypeResource> pagedResultResource = new PagedResultResource<EnrolmentStatusTypeResource>(
				"/enrolmentstatustypes");

		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);
		return pagedResultResource;
	}

}
