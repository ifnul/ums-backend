package org.lnu.is.dao.persistence.verifier;

/**
 * Default Verifier Chain Link.
 * @author ivanursul
 *
 * @param <T> resource.
 */
public abstract class DefaultVerifierChainLink<T> implements VerifierChainLink<T> {

	private VerifierChainLink<? super Object> nextVerifier;

	@Override
	public void verify(final T resource) {
		verifyLink(resource);
		
		if (nextVerifier != null) {
			nextVerifier.verify(resource);
		}
	}

	/**
	 * Template method for all verifiers.
	 * @param resource resource.
	 */
	protected abstract void verifyLink(T resource);

	public VerifierChainLink<? super Object> getNextVerifier() {
		return nextVerifier;
	}

	public void setNextVerifier(final VerifierChainLink<? super Object> nextVerifier) {
		this.nextVerifier = nextVerifier;
	}
	
}
