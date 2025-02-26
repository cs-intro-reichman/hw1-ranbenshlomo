// Calculates the future value of an investment with compound interest.
public class FVCalc {
    public static void main(String[] args) {
        // בדיקה: האם התקבלו מספיק ארגומנטים?
        if (args.length < 3) {
            System.out.println("Error: Please enter an initial amount, interest rate, and number of years.");
            return;
        }

        double P, r, t;

        // ניסיון להמיר את הקלט למספרים
        try {
            P = Double.parseDouble(args[0]); // סכום התחלתי
            r = Double.parseDouble(args[1]); // ריבית באחוזים
            t = Double.parseDouble(args[2]); // מספר שנים
        } catch (NumberFormatException e) {
            System.out.println("Error: All inputs must be valid numbers.");
            return;
        }

        if (P < 0) {
            System.out.println("Error: The initial investment must be non-negative.");
            return;
        }

        if (t < 0) {
            System.out.println("Error: The investment period must be non-negative.");
            return;
        }

        // חישוב הערך העתידי עם ריבית מחולקת ל-100
        double FV = P * Math.pow(1 + (r / 100), t);

        // **תיקון בעיית העיגול**: עיגול לערך הקרוב ביותר עם Math.round()
        long roundedFV = Math.round(FV);

        // הדפסת התוצאה בפורמט תואם לבדיקה
        System.out.println("After " + (int) t + " years, a $" + (int) P + " saved at " + String.format("%.1f", r) + "% will yield $" + roundedFV);
    }
}