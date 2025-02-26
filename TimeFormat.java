// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int newHours = 0;
		String period = null;
        if (hours == 00) {
			newHours = 12;
			period = "AM";
		}
		if (hours <= 11 && hours >= 1){
			newHours = hours;
			period = "AM";
		}
		else if (hours <= 23 && hours >= 13){
			newHours = hours - 12;
			period = "PM";
		}
		System.out.println(newHours + ":" + minutes + " " + period);
	}
}