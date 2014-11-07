package org.lnu.is.domain.specofferbenefit;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.lnu.is.domain.Model;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
/**
 * Specoffer Benefit entity.
 * @author illay
 *
 */
@Entity
@Table(name="q_ob_specofferbanefit")
public class SpecofferBenefit extends Model {

	private static final long serialVersionUID = 1L;
	
	private SpecOffer specOffer;
	
	private Benefit benefit;

	public SpecOffer getSpecOffer() {
		return specOffer;
	}

	public void setSpecOffer(SpecOffer specOffer) {
		this.specOffer = specOffer;
	}

	public Benefit getBenefit() {
		return benefit;
	}

	public void setBenefit(Benefit benefit) {
		this.benefit = benefit;
	}
	
}
