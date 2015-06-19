package org.lnu.is.multysearch.resource;

import java.util.List;

import org.lnu.is.resource.Resource;


public abstract class ApiMultySearchResource extends Resource{
    
	private List<Long> id;
	private List<String> note;

    	public List<Long> getId() {
	    return id;
	}

	public void setId(List<Long> id) {
	    this.id = id;
	}


	public List<String> getNote() {
	    return note;
	}


	public void setNote(List<String> note) {
	    this.note = note;
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
	public boolean equals(Object obj) {
	    if (this == obj)
		return true;
	    if (obj == null)
		return false;
	    if (getClass() != obj.getClass())
		return false;
	    ApiMultySearchResource other = (ApiMultySearchResource) obj;
	    if (id == null) {
		if (other.id != null)
		    return false;
	    } else if (!id.equals(other.id))
		return false;
	    if (note == null) {
		if (other.note != null)
		    return false;
	    } else if (!note.equals(other.note))
		return false;
	    return true;
	}


	@Override
	public String toString() {
	    return "ApiMultySearchResource [id=" + id + ", note=" + note + "]";
	}

}
