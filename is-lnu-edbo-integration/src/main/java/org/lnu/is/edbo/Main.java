package org.lnu.is.edbo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
public class Main {

	@Resource
	private Edbo edbo;

	public static String getActualDate(int year,int month,int date) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);

		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		return formatter.format(c.getTime());
	}
	
	public static String getActualDate() {
		Date now = new Date();
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		return formatter.format(now);
	}
	public void synchronize() {
		try {
			edbo.GetAllSpecoffer(false, "", 0);
			edbo.GetAllRequest("",0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
