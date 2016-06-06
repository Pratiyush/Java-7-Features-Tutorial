package features;

/*In JDK 7, you can express literal values in binary with prefix '0b' (or '0B') 
 * for integral types (byte, short, int and long), similar to C/C++ language. 
 * Before JDK 7, you can only use octal values (with prefix '0') or hexadecimal 
 * values (with prefix '0x' or '0X').You are also permitted to use underscore (_)
 *  to break the digits to improve the readability but you must start and end with a digit, e.g.,
 *  int number1 = 0b01010000101000101101000010100010;
 *  int number2 = 0b0101_0000_1010_0010_1101_0000_1010_0010;
 *  int number3 = 2_123_456;  // break the digits with underscore
*/public class BinaryLiteralsWith0bPrefix
 {

	public static void main(String[] args) {
		 // Some 32-bit 'int' literal values
	      int anInt1 = 0b0101_0000_1010_0010_1101_0000_1010_0010;
	      int anInt2 = 0b0011_1000;
	 
	      // An 8-bit 'byte' literal value. By default, literal values are 'int'.
	      // Need to cast to 'byte'
	      byte aByte = (byte)0b0110_1101;
	 
	      // A 16-bit 'short' literal value
	      short aShort = (short)0b0111_0101_0000_0101;
	 
	      // A 64-bit 'long' literal value. Long literals requires suffix "L".
	      long aLong = 0b1000_0101_0001_0110_1000_0101_0000_1010_0010_1101_0100_0101_1010_0001_0100_0101L;
	 
	      // Formatted output: "%d" for integer in decimal, "%x" in hexadecimal, "%o" in octal.
	      // Take note that "%b" prints true or false (for null), NOT binary.
	      System.out.printf("%d(%x)(%o)(%b)\n", anInt1, anInt1, anInt1, anInt1);
	      System.out.printf("%d(%x)(%o)(%b)\n", aByte, aByte, aByte, aByte);
	}
}
