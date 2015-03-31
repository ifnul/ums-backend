package org.is.lnu.edbo.resource.person;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * Class-request for finding required. 
 * @author ivanursul
 *
 */
public class EdboPersonFindRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "Null is not allowed")
	private String fioMask;

	@NotNull(message = "Null is not allowed")
    private String documentSeries;
	
	@NotNull(message = "Null is not allowed")
    private String documentNumber;
	
	@NotNull(message = "Null is not allowed")
    private String idsDocumentTypes;
	
	@NotNull(message = "Null is not allowed")
    private Integer hundred;
	
	@NotNull(message = "Null is not allowed")
    private String personCodeU;
	
	@NotNull(message = "Null is not allowed")
    private String filters;
    
	public String getFioMask() {
		return fioMask;
	}
	
	public void setFioMask(final String fioMask) {
		this.fioMask = fioMask;
	}
	
	public String getDocumentSeries() {
		return documentSeries;
	}
	
	public void setDocumentSeries(final String documentSeries) {
		this.documentSeries = documentSeries;
	}
	
	public String getDocumentNumber() {
		return documentNumber;
	}
	
	public void setDocumentNumber(final String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
	public String getIdsDocumentTypes() {
		return idsDocumentTypes;
	}
	
	public void setIdsDocumentTypes(final String idsDocumentTypes) {
		this.idsDocumentTypes = idsDocumentTypes;
	}
	
	public Integer getHundred() {
		return hundred;
	}
	
	public void setHundred(final Integer hundred) {
		this.hundred = hundred;
	}
	
	public String getPersonCodeU() {
		return personCodeU;
	}
	
	public void setPersonCodeU(final String personCodeU) {
		this.personCodeU = personCodeU;
	}
	
	public String getFilters() {
		return filters;
	}
	
	public void setFilters(final String filters) {
		this.filters = filters;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((documentNumber == null) ? 0 : documentNumber.hashCode());
		result = prime * result
				+ ((documentSeries == null) ? 0 : documentSeries.hashCode());
		result = prime * result + ((filters == null) ? 0 : filters.hashCode());
		result = prime * result + ((fioMask == null) ? 0 : fioMask.hashCode());
		result = prime
				* result
				+ ((idsDocumentTypes == null) ? 0 : idsDocumentTypes.hashCode());
		result = prime * result
				+ ((personCodeU == null) ? 0 : personCodeU.hashCode());
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
		EdboPersonFindRequest other = (EdboPersonFindRequest) obj;
		if (documentNumber == null) {
			if (other.documentNumber != null) {
				return false;
			}
		} else if (!documentNumber.equals(other.documentNumber)) {
			return false;
		}
		if (documentSeries == null) {
			if (other.documentSeries != null) {
				return false;
			}
		} else if (!documentSeries.equals(other.documentSeries)) {
			return false;
		}
		if (filters == null) {
			if (other.filters != null) {
				return false;
			}
		} else if (!filters.equals(other.filters)) {
			return false;
		}
		if (fioMask == null) {
			if (other.fioMask != null) {
				return false;
			}
		} else if (!fioMask.equals(other.fioMask)) {
			return false;
		}
		if (idsDocumentTypes == null) {
			if (other.idsDocumentTypes != null) {
				return false;
			}
		} else if (!idsDocumentTypes.equals(other.idsDocumentTypes)) {
			return false;
		}
		if (personCodeU == null) {
			if (other.personCodeU != null) {
				return false;
			}
		} else if (!personCodeU.equals(other.personCodeU)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EdboPersonFindRequest [fioMask=" + fioMask
				+ ", documentSeries=" + documentSeries + ", documentNumber="
				+ documentNumber + ", idsDocumentTypes=" + idsDocumentTypes
				+ ", hundred=" + hundred + ", personCodeU=" + personCodeU
				+ ", filters=" + filters + "]";
	}

}
