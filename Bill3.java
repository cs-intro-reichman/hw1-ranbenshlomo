// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        String name1 = args[0];

        // המרת הטקסט למספר
        double billAmount = Integer.parseInt(name1);

        if (billAmount < 0) {
            System.out.println("Negative number is impossible");
            return;
        }

        // חישוב התשלום לכל סועד
        double paymentAmount = (double) billAmount / 3;

        // בדיקה אם המספר שלם
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