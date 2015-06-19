package org.lnu.is.multysearch;

import java.util.List;

import org.lnu.is.domain.Model;
/**
 * Model for multiSearch.
 * @author illay
 *
 */
public class MultiSearchModel extends Model {
    
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
	public String toString() {
	    return "MultiSearchModel [id=" + id + ", note=" + note + "]";
	}

	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((id == null) ? 0 : id.hashCode());
	    result = prime * result + ((note == null) ? 0 : note.hashCode());
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
	    MultiSearchModel other = (MultiSearchModel) obj;
	    if (id == null) {
		if (other.id != null) {
		    return false;
		}
	    } else if (!id.equals(other.id)) {
		return false;
	    }
	    if (note == null) {
		if (other.note != null) {
		    return false;
		}
	    } else if (!note.equals(other.note)) {
		return false;
	    }
	    return true;
	}
	
	
}
