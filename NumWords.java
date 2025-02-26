
public class NumWords {
	public static void main(String args[]) {
		double number = Integer.parseInt(args[0]);
		double hundreds = Math.floor(number / 100);
		double tens = Math.floor((number / 10) % 10);
		double units = number % 10;
		
		System.out.println("hundreds is: "+hundreds);
		System.out.println("tens is: "+tens);
		System.out.println("units is: "+units);
		}
}
