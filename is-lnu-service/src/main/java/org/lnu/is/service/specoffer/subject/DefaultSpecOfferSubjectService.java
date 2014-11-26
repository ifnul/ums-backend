package org.lnu.is.service.specoffer.subject;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.specoffer.subject.SpecOfferSubjectDao;
import org.springframework.stereotype.Service;

/**
 * Default SpecOffer Subject Service.
 * @author ivanursul
 *
 */
@Service("specOfferSubjectService")
public class DefaultSpecOfferSubjectService implements SpecOfferSubjectService {

	@Resource(name = "specOfferSubjectDao")
	private SpecOfferSubjectDao specOfferSubjectDao;
	
}
