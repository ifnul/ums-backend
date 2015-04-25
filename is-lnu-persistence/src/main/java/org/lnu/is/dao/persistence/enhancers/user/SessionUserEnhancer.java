package org.lnu.is.dao.persistence.enhancers.user;

import javax.annotation.Resource;

import org.lnu.is.dao.persistence.enhancers.DefaultEnhancer;
import org.lnu.is.domain.EntityModel;
import org.lnu.is.domain.user.User;
import org.lnu.is.security.service.SessionService;

/**
 * Method for setting session user to entity before storing.
 * @author ivanursul
 *
 * @param <T> entity.
 */
public class SessionUserEnhancer<T extends EntityModel> extends DefaultEnhancer<T> {

    @Resource(name = "sessionService")
    private SessionService sessionService;
	
	@Override
	protected void enhanceEntity(final T entity) {
		User user = sessionService.getUser();
		entity.setCrtUser(user.getLogin());
	}

}
