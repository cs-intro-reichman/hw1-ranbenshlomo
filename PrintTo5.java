
// Prints the numbers 0 to 5.
// (Same program as shown in lecture 1-1).
public class PrintTo5 {
	public static void main(String[] args) {
        int[] numberArray = new int[6];
        for (int i=0; i < numberArray.length; i++) {
            numberArray[i] = i;
            System.out.println(numberArray[i]);
        }
    }
 }