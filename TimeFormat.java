// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int newHours = 0;
		String period = null;
		if (hours == 0) {
			newHours = 12;
			period = "AM";
		} else if (hours >= 1 && hours <= 11) {
			newHours = hours;
			period = "AM";
		} else if (hours == 12) {
			newHours = hours;
			period = "PM";
		} else { // (hours >= 13 && hours <= 23)
			newHours = hours - 12;
			period = "PM";
		}
		System.out.println(newHours + ":" + minutes + " " + period);
	}
}