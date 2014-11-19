package org.lnu.is.domain.post;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.posttype.PostType;

/**
 * Post entity.
 * @author ivanursul
 *
 */
@OB
@Entity
@Table(name = "q_ob_post")
public class Post extends Model {
	private static final long serialVersionUID = 1L;

	@Column(name = "abbrname")
	private String abbrName;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "posttype_id")
	private PostType postType;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Post parent;

	@OneToMany(mappedBy = "post")
	private List<PostName> names;
	
	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(final String abbrName) {
		this.abbrName = abbrName;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public PostType getPostType() {
		return postType;
	}

	public void setPostType(final PostType postType) {
		this.postType = postType;
	}

	public Post getParent() {
		return parent;
	}

	public void setParent(final Post parent) {
		this.parent = parent;
	}

	public List<PostName> getNames() {
		return names;
	}

	public void setNames(final List<PostName> names) {
		this.names = names;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
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
		Post other = (Post) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
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
		return "Post [abbrName=" + abbrName + ", name=" + name + "]";
	}
	
}
