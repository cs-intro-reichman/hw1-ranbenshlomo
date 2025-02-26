public class FVCalc {
	public static void main(String[] args){
		double P = Double.parseDouble(args[0]); // סכום התחלתי של ההשקעה
		double r = Double.parseDouble(args[1]); // הריבית כאחוז
		double t = Double.parseDouble(args[2]); // משך הזמן (בשנים)
		double FV = 0; // הערך העתידי בסוף כתלות בשנים

		if (P<0) {
			System.out.println("The first invenstment must be non negative.");
		}
		if (t<0) {
			System.out.println("The time of the invenstment must be non negative.");
		}
		if (P>=0 & t>=0) {
			FV = P*Math.pow(1+r,t);
			System.out.println("After "+t+" years, the FV will be: "+FV);
		}
	}
}