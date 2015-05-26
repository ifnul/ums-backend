package org.lnu.is.domain.mark.scale.value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.mark.scale.MarkScale;


/**
 * MarkScale value entity.
 * @author OlehZanevych
 *
 */
@OB
@Entity
@Table(name = "q_od_markscalevalue")
public class MarkScaleValue extends InformationModel {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "markscale_id")
	private MarkScale markScale;
	
	@Column(name = "strvalue")
	private String strValue;

	public MarkScale getMarkScale() {
		return markScale;
	}

	public void setMarkScale(final MarkScale markscale) {
		this.markScale = markscale;
	}

	public String getStrValue() {
		return strValue;
	}

	public void setStrValue(final String strValue) {
		this.strValue = strValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((strValue == null) ? 0 : strValue.hashCode());
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
		MarkScaleValue other = (MarkScaleValue) obj;
		if (strValue == null) {
			if (other.strValue != null) {
				return false;
			}
		} else if (!strValue.equals(other.strValue)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "MarkScaleValue [strValue=" + strValue + "]";
	}
	
}
