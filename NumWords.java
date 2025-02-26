public class NumWords {
    public static void main(String args[]) {
        int number = Integer.parseInt(args[0]); // שינוי מ-double ל-int
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        // הדפסת הפלט בפורמט הנכון
        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + units + " ones.");
    }
}