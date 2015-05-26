package org.lnu.is.resource.message;

/**
 * Pair class.
 * @author ivanursul
 *
 * @param <TYPE> Type
 * @param <VALUE> Value
 */
public class Pair<TYPE, VALUE> {

	private TYPE name;
	private VALUE value;
	
	/**
	 * Default constructor.
	 */
	public Pair() {
		super();
	}

	/**
	 * Constructor with all parameters.
	 * @param name name
	 * @param value value
	 */
	public Pair(final TYPE name, final VALUE value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public TYPE getName() {
		return name;
	}
	public void setName(final TYPE name) {
		this.name = name;
	}
	public VALUE getValue() {
		return value;
	}
	public void setValue(final VALUE value) {
		this.value = value;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Pair<?, ?> other = (Pair<?, ?>) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (value == null) {
			if (other.value != null) {
				return false;
			}
		} else if (!value.equals(other.value)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Pair [name=" + name + ", value=" + value + "]";
	}
	
}
