package org.lnu.is.facade.facade.person;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.resource.person.paper.PersonPaperResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.service.person.paper.PersonPaperService;

/**
 * Default implementation of person paper facade.
 * @author ivanursul
 *
 */
@Facade("personPaperFacade")
public class DefaultPersonPaperFacade implements PersonPaperFacade {

	@Resource
	private PersonPaperService personPaperService;

	@Override
	public PersonPaperResource createPersonPaper(final Long personId, final PersonPaperResource personPaperResource) {
		return null;
	}

	@Override
	public void updatePersonPaper(final Long personId, final Long personPaperId, final PersonPaperResource personPaperResource) {
		
	}

	@Override
	public PersonPaperResource getPersonPaper(final Long personId, final Long personPaperId) {
		return null;
	}

	@Override
	public void removePersonPaper(final Long personId, final Long personPaperId) {
		
	}

	@Override
	public PagedResultResource<PersonPaperResource> getPersonPapers(final Long personId, final PagedRequest<PersonPaperResource> pagedRequest) {
		return null;
	}
}
