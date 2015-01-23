package org.lnu.is.dao.verifier.entity;

import org.lnu.is.dao.exception.EntityNotFoundException;
import org.lnu.is.dao.verifier.DefaultVerifierChainLink;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.common.RowStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Current verifier check  if entity is valid.
 * @author ivanursul
 *
 * @param <T> entity
 */
public class ValidEntityVerifier<T extends Model> extends DefaultVerifierChainLink<T> {
	private static final Logger LOG = LoggerFactory.getLogger(ValidEntityVerifier.class);
	
	@Override
	protected void verifyLink(final T entity) {
		
        if (entity == null) {
        	LOG.error("No entity found: {}");
        	throw new EntityNotFoundException("Entity is deleted");
        }
        
    	if (RowStatus.DELETED.equals(entity.getStatus())) {
        	LOG.error("Entity is deleted, {}, {}", entity.getClass().getSimpleName(), entity.getId());
        	throw new EntityNotFoundException("Entity does'nt exist");
        }
    	
	}

}
