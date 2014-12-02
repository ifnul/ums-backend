package org.lnu.is.domain.language;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.RF;
import org.lnu.is.domain.Model;

/**
 * Language Level entity.
 * @author ivanursul
 *
 */
@RF
@Entity
@Table(name = "q_rf_languagelevel")
public class LanguageLevel extends Model {
	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;
	
	@Column(name = "abbrname")
	private String abbrName;
	
	@Column(name = "description")
	private String description;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(final String abbrName) {
		this.abbrName = abbrName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "LanguageLevel [name=" + name + ", abbrName=" + abbrName
				+ ", description=" + description + "]";
	}
	
}
