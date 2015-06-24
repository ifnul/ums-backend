package org.lnu.is.resource;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Multi search Resource.
 */
public abstract class MultiSearchResource extends Resource {
    
	private List<Long> id;
	private List<String> note;

	public List<Long> getId() {
		return id;
	}

	public void setId(final List<Long> id) {
		this.id = id;
	}

	public List<String> getNote() {
		return note;
	}

	public void setNote(final List<String> note) {
		this.note = note;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		MultiSearchResource that = (MultiSearchResource) o;

		if (id != null ? !id.equals(that.id) : that.id != null) {
			return false;
		}
		return !(note != null ? !note.equals(that.note) : that.note != null);

	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (note != null ? note.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("note", note)
				.toString();
	}
}
