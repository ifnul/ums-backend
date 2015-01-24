package org.lnu.is.dao.enhancers.group;

import javax.annotation.Resource;

import org.lnu.is.dao.enhancers.DefaultEnhancer;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.group.Group;
import org.lnu.is.security.service.SessionService;

/**
 * Enhancer for setting default crt usergroup for entity.
 * @author ivanursul
 *
 * @param <T> entity.
 */
public class DefaultGroupEnhancer<T extends Model> extends DefaultEnhancer<T> {

    @Resource(name = "sessionService")
    private SessionService sessionService;
	
	@Override
	protected void enhanceEntity(final T entity) {
		Group group = sessionService.getDefaultGroup();
		entity.setCrtUserGroup(group.getTitle());
	}

}
