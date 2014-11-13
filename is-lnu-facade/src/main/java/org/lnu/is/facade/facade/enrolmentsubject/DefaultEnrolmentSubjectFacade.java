package org.lnu.is.facade.facade.enrolmentsubject;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.enrolmentsubject.EnrolmentSubjectResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.enrolmentsubject.EnrolmentSubjectService;

/**
 * Default implementation of enrolment subject facade.
 * @author ivanursul
 *
 */
@Facade("enrolmentSubjectFacade")
public class DefaultEnrolmentSubjectFacade implements EnrolmentSubjectFacade {

	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest<EnrolmentSubjectResource>, PagedSearch<EnrolmentSubject>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	//@Resource(name = "enrolmentSubjectConverter")
	private Converter<EnrolmentSubject, EnrolmentSubjectResource> enrolmentSubjectConverter;
	
	@Resource(name = "enrolmentSubjectService")
	private EnrolmentSubjectService enrolmentSubjectService;
	
	@Override
	public PagedResultResource<EnrolmentSubjectResource> getEnrolmentSubjects(final PagedRequest<EnrolmentSubjectResource> request) {
		
		PagedSearch<EnrolmentSubject> pagedSearch = pagedRequestConverter.convert(request);
		PagedResult<EnrolmentSubject> pagedResult = enrolmentSubjectService.getEnrolmentSubjects(pagedSearch);
		
		List<EnrolmentSubjectResource> resources = enrolmentSubjectConverter.convertAll(pagedResult.getEntities());
		
		PagedResultResource<EnrolmentSubjectResource> pagedResultResource = new PagedResultResource<>("/enrolmentsubjects");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);
		
		return pagedResultResource;
	}

}
