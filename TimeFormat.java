public class TimeFormat {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int newHours;
        String period;

        if (hours == 0 && minutes == 0) { 
            newHours = 0; // 00:00 צריך להיות 0:00 AM
            period = "AM";
        } else if (hours == 0) { 
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

        // הדפסת השעה החדשה עם ספרות דקות בפורמט תקין
        System.out.println(newHours + ":" + String.format("%02d", minutes) + " " + period);
    }
}