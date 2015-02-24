package org.lnu.is.facade.facade.session;

import org.lnu.is.resource.session.SessionResource;

/**
 * Interface for declaring session functionality.
 * @author ivanursul
 *
 */
public interface SessionFacade {

	/**
	 * Method for getting current session.
	 * @return current session.
	 */
	SessionResource getCurrentSession();

}
