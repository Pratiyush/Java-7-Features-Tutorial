package features;

//Before JDK 7, only integral types can be used as selector for switch-case statement. 
	//In JDK 7, you can use a String object as the selector. For example,
public class StringSwitch {

	public static void main(String[] args) {
		String day = "SAT";
		switch (day) {
		   case "MON": System.out.println("Monday"); break;
		   case "TUE": System.out.println("Tuesday"); break;
		   case "WED": System.out.println("Wednesday"); break;
		   case "THU": System.out.println("Thursday"); break;
		   case "FRI": System.out.println("Friday"); break;
		   case "SAT": System.out.println("Saturday"); break;
		   case "SUN": System.out.println("Sunday"); break;
		   default: System.out.println("Invalid");
		}
	}
}
