package org.lnu.is.domain.specofferbenefit;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
/**
 * Specoffer Benefit entity.
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_specofferbenefit")
public class SpecofferBenefit extends Model {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "specoffer_id")
	private SpecOffer specOffer;

	@ManyToOne
	@JoinColumn(name = "benefit_id")
	private Benefit benefit;

	public SpecOffer getSpecOffer() {
		return specOffer;
	}

	public void setSpecOffer(final SpecOffer specOffer) {
		this.specOffer = specOffer;
	}

	public Benefit getBenefit() {
		return benefit;
	}

	public void setBenefit(final Benefit benefit) {
		this.benefit = benefit;
	}
	
}
