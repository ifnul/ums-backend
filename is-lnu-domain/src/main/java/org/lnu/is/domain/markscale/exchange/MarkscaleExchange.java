package org.lnu.is.domain.markscale.exchange;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.value.MarkscaleValue;


/**
 * Markscale exchange entity.
 * @author OlehZanevych
 *
 */
@OB
@Entity
@Table(name = "q_od_markscaleexchange")
public class MarkscaleExchange extends InformationModel {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "markscale_id")
	private Markscale markscale;
	
	@ManyToOne
	@JoinColumn(name = "markscalevalue_id")
	private MarkscaleValue markscaleValue;
	
	@ManyToOne
	@JoinColumn(name = "markscaleexchange_id")
	private Markscale markscaleExchange;
	
	@ManyToOne
	@JoinColumn(name = "markscaleexchangevalue_id")
	private MarkscaleValue markscaleExchangeValue;
	
	@Column(name = "markmin")
	private Double markMin;
	
	@Column(name = "markmax")
	private Double markMax;
	
	@Column(name = "markexchange")
	private Double markExchange;

	public Markscale getMarkscale() {
		return markscale;
	}

	public void setMarkscale(final Markscale markscale) {
		this.markscale = markscale;
	}

	public MarkscaleValue getMarkscaleValue() {
		return markscaleValue;
	}

	public void setMarkscaleValue(final MarkscaleValue markscaleValue) {
		this.markscaleValue = markscaleValue;
	}

	public Markscale getMarkscaleExchange() {
		return markscaleExchange;
	}

	public void setMarkscaleExchange(final Markscale markscaleExchange) {
		this.markscaleExchange = markscaleExchange;
	}

	public MarkscaleValue getMarkscaleExchangeValue() {
		return markscaleExchangeValue;
	}

	public void setMarkscaleExchangeValue(final MarkscaleValue markscaleExchangeValue) {
		this.markscaleExchangeValue = markscaleExchangeValue;
	}

	public Double getMarkMin() {
		return markMin;
	}

	public void setMarkMin(final Double markMin) {
		this.markMin = markMin;
	}

	public Double getMarkMax() {
		return markMax;
	}

	public void setMarkMax(final Double markMax) {
		this.markMax = markMax;
	}

	public Double getMarkExchange() {
		return markExchange;
	}

	public void setMarkExchange(final Double markExchange) {
		this.markExchange = markExchange;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((markExchange == null) ? 0 : markExchange.hashCode());
		result = prime * result + ((markMax == null) ? 0 : markMax.hashCode());
		result = prime * result + ((markMin == null) ? 0 : markMin.hashCode());
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
		MarkscaleExchange other = (MarkscaleExchange) obj;
		if (markExchange == null) {
			if (other.markExchange != null) {
				return false;
			}
		} else if (!markExchange.equals(other.markExchange)) {
			return false;
		}
		if (markMax == null) {
			if (other.markMax != null) {
				return false;
			}
		} else if (!markMax.equals(other.markMax)) {
			return false;
		}
		if (markMin == null) {
			if (other.markMin != null) {
				return false;
			}
		} else if (!markMin.equals(other.markMin)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "MarkscaleExchange [markMin=" + markMin + ", markMax=" + markMax
				+ ", markExchange=" + markExchange + "]";
	}
	
}
