package features;

/*/In JDK 7, you could insert underscore(s) '_' in between the digits in 
an numeric literals (integral and floating-point literals) to improve readability. For example,
*/
public class UnderscoreforNumericLiterals
 {

	public static void main(String[] args) {
		int anInt = 0b10101000_01010001_01101000_01010001;
		double aDouble = 3.1415_9265;
		float  aFloat = 3.14_15_92_65f;
		
		System.out.println("anInt"+anInt);
		System.out.println("aDouble"+aDouble);
		System.out.println("aFloat"+aFloat);
	}
}
