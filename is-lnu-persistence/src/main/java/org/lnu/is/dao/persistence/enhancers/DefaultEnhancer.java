package org.lnu.is.dao.persistence.enhancers;

/**
 * Default Verifier Chain Link.
 * @author ivanursul
 *
 * @param <T> resource.
 */
public abstract class DefaultEnhancer<T> implements Enhancer<T> {

	private Enhancer<? super Object> nextEnhancer;

	@Override
	public void enhance(final T entity) {
		enhanceEntity(entity);
		
		if (nextEnhancer != null) {
			nextEnhancer.enhance(entity);
		}
	}

	/**
	 * Template method for all enhancers.
	 * @param entity entity
	 */
	protected abstract void enhanceEntity(T entity);

	public Enhancer<? super Object> getNextEnhancer() {
		return nextEnhancer;
	}

	public void setNextEnhancer(final Enhancer<? super Object> nextEnhancer) {
		this.nextEnhancer = nextEnhancer;
	}
	
}
