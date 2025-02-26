// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        // בדיקה: האם התקבלו מספיק ארגומנטים?
        if (args.length < 4) {
            System.out.println("Error: Please enter three names followed by the bill amount.");
            return;
        }

        // שמות הלקוחות (לא נעשה בהם שימוש, אך שומרים על המבנה המקורי)
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];

        double billAmount;

        // ניסיון להמיר את הקלט הרביעי (הסכום) למספר
        try {
            billAmount = Integer.parseInt(args[3]);
        } catch (NumberFormatException e) {
            System.out.println("Error: The bill amount must be a valid number.");
            return;
        }

        if (billAmount < 0) {
            System.out.println("Negative number is impossible");
            return;
        }

        // חישוב התשלום לכל סועד
        double paymentAmount = (double) billAmount / 3;

        // בדיקה אם התשלום הוא מספר שלם
        if (paymentAmount == Math.floor(paymentAmount)) {
            System.out.println("The amount is: " + paymentAmount);
        } else {
            double rounded1 = Math.floor(paymentAmount);
            double change = billAmount % 3; // חישוב שארית אמיתי

            System.out.println("The amount is: " + rounded1);
            System.out.println("The change that left is: " + change);
        }
    }
}