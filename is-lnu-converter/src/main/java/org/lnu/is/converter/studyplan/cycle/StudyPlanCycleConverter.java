package org.lnu.is.converter.studyplan.cycle;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.studyplan.cycle.StudyPlanCycle;
import org.lnu.is.resource.studyplan.cycle.StudyPlanCycleResource;


/**
 * StudyPlanCycle Type Converter.
 * @author OlehZanevych
 *
 */
@Converter("studyPlanCycleConverter")
public class StudyPlanCycleConverter extends AbstractConverter<StudyPlanCycle, StudyPlanCycleResource> {

	@Override
	public StudyPlanCycleResource convert(final StudyPlanCycle source, final StudyPlanCycleResource target) {
		
		target.setId(source.getId());
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public StudyPlanCycleResource convert(final StudyPlanCycle source) {
		return convert(source, new StudyPlanCycleResource());
	}

}
