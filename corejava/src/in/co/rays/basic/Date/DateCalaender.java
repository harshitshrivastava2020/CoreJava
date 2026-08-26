package in.co.rays.basic.Date;

import java.util.Calendar;

public class DateCalaender {
	public static void main(String[] args) {
		int year = 2026;
		Calendar cal = Calendar.getInstance();

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		for (int month = 0; month < months.length; month++) {
			cal.set(year, month, 1);
			System.out.println("\n---------------- " + months[month] + " " + year + " ----------------");
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");

			int firstDay = cal.get(Calendar.DAY_OF_WEEK);

			for (int i = Calendar.SUNDAY; i < firstDay; i++) {
				System.out.print("    ");

			}
			int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			for (int day = 1; day <= maxDay; day++) {
				System.out.printf("%3d ", day);

				if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
					System.out.println();

				}
				cal.add(Calendar.DAY_OF_MONTH, 1);
			}
			System.out.println();

		}
	}
}
