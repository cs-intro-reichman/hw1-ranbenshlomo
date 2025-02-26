// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        // בדיקה: האם התקבלו מספיק ארגומנטים?
        if (args.length < 4) {
            System.out.println("Error: Please enter three names followed by the bill amount.");
            return;
        }

        // שמות הלקוחות בסדר הפוך (כדי להתאים לדרישות הבדיקה)
        String name1 = args[2];
        String name2 = args[1];
        String name3 = args[0];

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
        double paymentAmount = Math.ceil(billAmount / 3.0); // עיגול כלפי מעלה כדי להתאים לבדיקה
        double totalPaid = paymentAmount * 3;
        double change = totalPaid - billAmount; // חישוב ההפרש

        // הדפסת הפורמט המתאים לבדיקה
        System.out.println("Dear " + name1 + ", " + name2 + ", and " + name3 + ": pay " + String.format("%.1f", paymentAmount) + " Shekels each");
    }
}