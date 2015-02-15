package org.lnu.is.extractor.studyplan.cycle;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.studyplan.cycle.StudyPlanCycle;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * StudyPlan Cycle Parameters Extractor.
 * @author OlehZanevych
 *
 */
@ParametersExtractor("studyPlanCycleParametersExtractor")
public class StudyPlanCycleParametersExtractor extends AbstractParametersExtractor<StudyPlanCycle> {

	@Override
	public Map<String, Object> getParameters(final StudyPlanCycle entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
