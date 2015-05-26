package org.lnu.is.converter.wave.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.wave.type.WaveType;
import org.lnu.is.resource.wave.type.WaveTypeResource;
/**
 * WaveType converter.
 * @author illay
 *
 */
@Converter("waveTypeConverter")
public class WaveTypeConverter extends AbstractConverter<WaveType, WaveTypeResource> {

	@Override
	public WaveTypeResource convert(final WaveType source, final WaveTypeResource target) {
		target.setId(source.getId());
		target.setName(source.getName());
		return target;
	}

	@Override
	public WaveTypeResource convert(final WaveType source) {
		return convert(source, new WaveTypeResource());
	}

}
