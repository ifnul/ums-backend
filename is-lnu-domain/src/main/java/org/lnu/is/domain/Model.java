package org.lnu.is.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Common model for all entities.
 * I want to emphasize about getters and setters
 * for date- related fields.A standart approach 
 * of writing getters and setters is that you do
 * something like this:
 *  
 *  public Date getCreateDate() {
 *       return createDate;
 *  }
 *	
 *  public void setCreateDate(final Date createDate) {
 *      this.createDate = createDate;
 *  }
 *  
 *  But in this case we do it with instantiating a new
 *  object, because of mutable object Date.
 *  More information about this approach you can find
 *  by googling findbug error "EI_EXPOSE_REP".
 *  
 * @author ivanursul
 *
 */
@MappedSuperclass
public abstract class Model implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return new Date(createDate.getTime());
    }

    public void setCreateDate(final Date createDate) {
        this.createDate = new Date(createDate.getTime());
    }

    public Date getUpdateDate() {
        return new Date(updateDate.getTime());
    }

    public void setUpdateDate(final Date updateDate) {
        this.updateDate = new Date(updateDate.getTime());
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((updateDate == null) ? 0 : updateDate.hashCode());
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
		Model other = (Model) obj;
		if (createDate == null) {
			if (other.createDate != null) {
				return false;
			}
		} else if (!createDate.equals(other.createDate)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (updateDate == null) {
			if (other.updateDate != null) {
				return false;
			}
		} else if (!updateDate.equals(other.updateDate)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Model [id=" + id + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}
    
}
