package org.lnu.is.edbo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
public class Main {

	@Resource(name = "edboIntegration")
	private Edbo edbo;

	public String getActualDate(int year,int month,int date) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);

		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		return formatter.format(c.getTime());
	}
	
	public String getActualDate() {
		Date now = new Date();
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		return formatter.format(now);
	}

	public void synchronizeAll(boolean updateExist, String  sessionGuid, Integer year) {
		 String actualDate = getActualDate();

		edbo.synchronizeSpecoffers(updateExist, sessionGuid, year,actualDate);
		edbo.synchronizeRequests(updateExist,sessionGuid, year,actualDate);

	}

	public void synchronizeSpecoffers(boolean updateExist, String  sessionGuid, Integer year){

		String actualDate = getActualDate();
		edbo.synchronizeSpecoffers(updateExist, sessionGuid, year, actualDate);

	}

	public String login(String login, String password) {
		return edbo.login(login, password);
	}
}
