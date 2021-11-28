package simple;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PracDateFormat {

	public static String getCurrentDate() {

		DateFormat formatDate = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");

		Date currentDate = new Date();

		return formatDate.format(currentDate);

	}

}
