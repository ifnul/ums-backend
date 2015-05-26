package org.lnu.is.converter.wave.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.wave.type.WaveType;
import org.lnu.is.resource.wave.type.WaveTypeResource;

/**
 * WaveType resource converter.
 * @author illay
 *
 */
@Converter("waveTypeResourceConverter")
public class WaveTypeResourceConverter extends
		AbstractConverter<WaveTypeResource, WaveType> {

	@Override
	public WaveType convert(final WaveTypeResource source, final WaveType target) {
		target.setName(source.getName());
		return target;
	}

	@Override
	public WaveType convert(final WaveTypeResource source) {
		return convert(source, new WaveType());
	}
}
