package org.lnu.is.dao.dao.specoffer.subject;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.springframework.stereotype.Repository;

/**
 * Default Spec Offer Subject dao.
 * @author ivanursul
 *
 */
@Repository("specOfferSubjectDao")
public class DefaultSpecOfferSubjectDao extends AbstractDao<SpecofferSubject, Long> implements SpecOfferSubjectDao {

	@Override
	public Class<SpecofferSubject> getEntityClass() {
		return SpecofferSubject.class;
	}

}
