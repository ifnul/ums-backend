package org.lnu.is.dao.persistence.enhancers.group;

import javax.annotation.Resource;

import org.lnu.is.dao.persistence.enhancers.DefaultEnhancer;
import org.lnu.is.domain.EntityModel;
import org.lnu.is.domain.group.Group;
import org.lnu.is.security.service.SessionService;

/**
 * Enhancer for setting default crt usergroup for entity.
 * @author ivanursul
 *
 * @param <T> entity.
 */
public class DefaultGroupEnhancer<T extends EntityModel> extends DefaultEnhancer<T> {

    @Resource(name = "sessionService")
    private SessionService sessionService;
	
	@Override
	protected void enhanceEntity(final T entity) {
		Group group = sessionService.getDefaultGroup();
		entity.setCrtUserGroup(group.getTitle());
	}

}
