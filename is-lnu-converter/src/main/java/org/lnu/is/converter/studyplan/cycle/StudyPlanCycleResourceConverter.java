package org.lnu.is.converter.studyplan.cycle;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.studyplan.cycle.StudyPlanCycle;
import org.lnu.is.resource.studyplan.cycle.StudyPlanCycleResource;

/**
 * StudyPlanCycle Resource Converter.
 * @author OlehZanevych
 *
 */
@Converter("studyPlanCycleResourceConverter")
public class StudyPlanCycleResourceConverter extends AbstractConverter<StudyPlanCycleResource, StudyPlanCycle> {

	@Override
	public StudyPlanCycle convert(final StudyPlanCycleResource source, final StudyPlanCycle target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public StudyPlanCycle convert(final StudyPlanCycleResource source) {
		return convert(source, new StudyPlanCycle());
	}

}
