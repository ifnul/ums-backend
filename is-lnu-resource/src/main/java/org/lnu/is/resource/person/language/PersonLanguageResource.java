package org.lnu.is.resource.person.language;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Person Language Resource.
 * @author ivanursul
 *
 */
public class PersonLanguageResource extends ApiResource {

	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long personId;
	
	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long languageId;
	
	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long languageLevelId;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/languages/{1}", personId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/persons/{0}/languages", personId);
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(final Long languageId) {
		this.languageId = languageId;
	}

	public Long getLanguageLevelId() {
		return languageLevelId;
	}

	public void setLanguageLevelId(final Long languageLevelId) {
		this.languageLevelId = languageLevelId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((languageId == null) ? 0 : languageId.hashCode());
		result = prime * result
				+ ((languageLevelId == null) ? 0 : languageLevelId.hashCode());
		result = prime * result
				+ ((personId == null) ? 0 : personId.hashCode());
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
		PersonLanguageResource other = (PersonLanguageResource) obj;
		if (languageId == null) {
			if (other.languageId != null) {
				return false;
			}
		} else if (!languageId.equals(other.languageId)) {
			return false;
		}
		if (languageLevelId == null) {
			if (other.languageLevelId != null) {
				return false;
			}
		} else if (!languageLevelId.equals(other.languageLevelId)) {
			return false;
		}
		if (personId == null) {
			if (other.personId != null) {
				return false;
			}
		} else if (!personId.equals(other.personId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PersonLanguageResource [personId=" + personId + ", languageId="
				+ languageId + ", languageLevelId=" + languageLevelId + "]";
	}

}
