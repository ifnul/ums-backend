package org.lnu.is.domain.property;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.propertytype.PropertyType;

/**
 * Property entity.
 * @author illay
 *
 */
@OB
@Entity
@Table(name = "q_ob_property")
public class Property extends Model {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "propertytype_id")
	private PropertyType propertyType;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Property parent;
	
	@Column(name = "abbrname")
	private String abbrname;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "sortnum")
	private Integer sortNum;
	
	@Column(name = "priority")
	private Integer priority;

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(final PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public Property getParent() {
		return parent;
	}

	public void setParent(final Property parent) {
		this.parent = parent;
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

	public Integer getSortNum() {
		return sortNum;
	}

	public void setSortNum(final Integer sortNum) {
		this.sortNum = sortNum;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(final Integer priority) {
		this.priority = priority;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrname == null) ? 0 : abbrname.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((sortNum == null) ? 0 : sortNum.hashCode());
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
		Property other = (Property) obj;
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
		if (priority == null) {
			if (other.priority != null) {
				return false;
			}
		} else if (!priority.equals(other.priority)) {
			return false;
		}
		if (sortNum == null) {
			if (other.sortNum != null) {
				return false;
			}
		} else if (!sortNum.equals(other.sortNum)) {
			return false;
		}
		return true;
	}	
	
	@Override
	public String toString() {
		return "Property [abbrname=" + abbrname + ", name=" + name
				+ ", sortNum=" + sortNum + ", priority=" + priority + "]";
	}


}
