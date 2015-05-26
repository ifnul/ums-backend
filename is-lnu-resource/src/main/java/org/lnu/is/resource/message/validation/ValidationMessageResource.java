package org.lnu.is.resource.message.validation;

import java.util.List;

import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.message.Pair;

/**
 * Validation message resource.
 * @author ivanursul
 *
 */
public class ValidationMessageResource extends MessageResource {

	private List<Pair<String, String>> fields;

	/**
	 * Default constructor.
	 */
	public ValidationMessageResource() {
		super();
	}

	/**
	 * Constructor with all required parameters.
	 * @param messageType messageType
	 * @param message message
	 * @param fields fields
	 */
	public ValidationMessageResource(final MessageType messageType, final String message, final List<Pair<String, String>> fields) {
		super(messageType, message);
		this.fields = fields;
	}

	public List<Pair<String, String>> getFields() {
		return fields;
	}

	public void setFields(final List<Pair<String, String>> fields) {
		this.fields = fields;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fields == null) ? 0 : fields.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ValidationMessageResource other = (ValidationMessageResource) obj;
		if (fields == null) {
			if (other.fields != null) {
				return false;
			}
		} else if (!fields.equals(other.fields)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ValidationMessageResource [fields=" + fields + "]";
	}
	
}
