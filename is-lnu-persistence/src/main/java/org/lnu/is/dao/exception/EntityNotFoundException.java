package org.lnu.is.dao.exception;

/**
 * Custom exception, that mean, that entity does not exists.
 * @author ivanursul
 *
 */
public class EntityNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private Class<?> clz;
	private Object identifier;

	/**
	 * Common constuctor.
	 * @param message message
	 * @param clz clz
	 * @param identifier identifier
	 */
	public EntityNotFoundException(final String message, final Class<?> clz, final Object identifier) {
		super(message);
		this.clz = clz;
		this.identifier = identifier;
	}

	public Class<?> getClz() {
		return clz;
	}

	public Object getIdentifier() {
		return identifier;
	}
	
}
