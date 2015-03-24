package org.lnu.is.dao.builder.wave.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.wave.type.WaveType;
/**
 * WaveType query builder.
 * @author illay
 *
 */
@QBuilder("waveTypeQueryBuilder")
public class WaveTypeQueryBuilder extends AbstractQueryBuilder<WaveType>  {
	
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM WaveType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final WaveType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
						.addAndCondition(NAME_CONDITION, context.getName())
				.closeBracket();
	}

}
