package org.is.lnu.edbo.service.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Default implementation of actual date format.
 * @author ivanursul
 *
 */
public class DefaultActualDateService implements ActualDateService {

	@Override
	public String getActualDate() {
		Date now = new Date();
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		return formatter.format(now);
	}

}
