package hotelmanagement.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateOperations {

	/**
	 * Calulates difference between first and last date
	 *
	 * @param firstDate
	 *            dd.MM.yyyy format E.g. 31.12.1987
	 * @param lastDate
	 *            dd.MM.yyyy format E.g. 31.12.1987
	 * @return difference between first and last date
	 */
	public static int calculateDays(String firstDateStr, String lastDateStr) {
		SimpleDateFormat formatlayici = new SimpleDateFormat("dd.MM.yyyy");
		try {
			Date firstDate = formatlayici.parse(firstDateStr);
			Date lastDate = formatlayici.parse(lastDateStr);
			int difference = (int) (lastDate.getTime() - firstDate.getTime()) / (1000 * 60 * 60 * 24);

			return difference;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}
}
