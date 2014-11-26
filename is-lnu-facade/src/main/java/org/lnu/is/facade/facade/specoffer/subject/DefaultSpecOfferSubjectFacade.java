package org.lnu.is.facade.facade.specoffer.subject;

import javax.annotation.Resource;

import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.specoffer.subject.SpecOfferSubjectResource;
import org.lnu.is.service.specoffer.subject.SpecOfferSubjectService;

/**
 * Default Spec Offer Subject Facade.
 * @author ivanursul
 *
 */
@Facade("specOfferSubjectFacade")
public class DefaultSpecOfferSubjectFacade extends BaseFacade<SpecOfferSubjectResource, SpecofferSubject> implements SpecOfferSubjectFacade {

	@Resource(name = "specOfferSubjectService")
	private SpecOfferSubjectService specOfferSubjectService;
	
}
