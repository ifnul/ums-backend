package org.lnu.is.dao.persistence.enhancers.removal;

import org.lnu.is.dao.persistence.enhancers.DefaultEnhancer;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.common.RowStatus;

/**
 * Enhancer for setting row as deleted.
 * @author ivanursul
 *
 * @param <T> entity.
 */
public class RemovalEnhancer<T extends Model> extends DefaultEnhancer<T> {

	@Override
	protected void enhanceEntity(final T entity) {
		entity.setActual(0);
        entity.setStatus(RowStatus.DELETED);		
	}

}
