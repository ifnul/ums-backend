package org.lnu.is.domain.post;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;

/**
 * Post Name entity.
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_postname")
public class PostName extends InformationModel {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;
	
	@ManyToOne
	@JoinColumn(name = "language_id")
	private org.lnu.is.domain.language.language language;
	
	@Column(name = "abbrname")
	private String abbrname;
	
	@Column(name = "name")
	private String name;

	public Post getPost() {
		return post;
	}

	public void setPost(final Post post) {
		this.post = post;
	}

	public org.lnu.is.domain.language.language getLanguage() {
		return language;
	}

	public void setLanguage(final org.lnu.is.domain.language.language language) {
		this.language = language;
	}

	public String getAbbrname() {
		return abbrname;
	}

	public void setAbbrname(final String abbrname) {
		this.abbrname = abbrname;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrname == null) ? 0 : abbrname.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		PostName other = (PostName) obj;
		if (abbrname == null) {
			if (other.abbrname != null) {
				return false;
			}
		} else if (!abbrname.equals(other.abbrname)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PostName [abbrname=" + abbrname + ", name=" + name + "]";
	}
	
	
}
