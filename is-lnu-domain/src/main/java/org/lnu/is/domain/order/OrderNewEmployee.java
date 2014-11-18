package org.lnu.is.domain.order;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.DT;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.post.Post;

/**
 * Order New Employee entity.
 * 
 * @author kushnir
 *
 */
@DT
@Entity
@Table(name = "q_dt_ordernewemployee")
public class OrderNewEmployee extends Model {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;

	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;

	@ManyToOne
	@JoinColumn(name = "jobtype_id")
	private JobType jobType;

	@Column(name = "docseries")
	private String docSeries;

	@Column(name = "docnum")
	private String docNum;

	@Column(name = "isplurality")
	private Integer isPlurality;

	@Column(name = "rate")
	private Double rate;

	@Column(name = "begdate")
	private Date begDate;

	@Column(name = "enddate")
	private Date endDate;

	public Order getOrder() {
		return order;
	}

	public void setOrder(final Order order) {
		this.order = order;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(final Post post) {
		this.post = post;
	}

	public JobType getJobType() {
		return jobType;
	}

	public void setJobType(final JobType jobType) {
		this.jobType = jobType;
	}

	public String getDocSeries() {
		return docSeries;
	}

	public void setDocSeries(final String docSeries) {
		this.docSeries = docSeries;
	}

	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(final String docNum) {
		this.docNum = docNum;
	}

	public Integer getIsPlurality() {
		return isPlurality;
	}

	public void setIsPlurality(final Integer isPlurality) {
		this.isPlurality = isPlurality;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(final Double rate) {
		this.rate = rate;
	}

	public Date getBegDate() {
		return begDate;
	}

	public void setBegDate(final Date begDate) {
		this.begDate = begDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((isPlurality == null) ? 0 : isPlurality.hashCode());
		result = prime * result + ((rate == null) ? 0 : rate.hashCode());
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
		OrderNewEmployee other = (OrderNewEmployee) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (docNum == null) {
			if (other.docNum != null) {
				return false;
			}
		} else if (!docNum.equals(other.docNum)) {
			return false;
		}
		if (docSeries == null) {
			if (other.docSeries != null) {
				return false;
			}
		} else if (!docSeries.equals(other.docSeries)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (isPlurality == null) {
			if (other.isPlurality != null) {
				return false;
			}
		} else if (!isPlurality.equals(other.isPlurality)) {
			return false;
		}
		if (rate == null) {
			if (other.rate != null) {
				return false;
			}
		} else if (!rate.equals(other.rate)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "OrderNewEmployee [docSeries=" + docSeries + ", docNum="
				+ docNum + ", isPlurality=" + isPlurality + ", rate=" + rate
				+ ", begDate=" + begDate + ", endDate=" + endDate + "]";
	}

}
