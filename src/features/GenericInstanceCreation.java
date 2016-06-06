package features;

import java.util.ArrayList;
import java.util.List;

public class GenericInstanceCreation {

	public static void main(String[] args) {
		  // Pre-JDK 7
	      List<String> lst1 = new ArrayList<String>();
	      // JDK 7 supports limited type inference for generic instance creation
	      List<String> lst2 = new ArrayList<>();
	 
	      lst1.add("Mon");
	      lst1.add("Tue");
	      lst2.add("Wed");
	      lst2.add("Thu");
	 
	      for (String item: lst1) {
	         System.out.println(item);
	      }
	 
	      for (String item: lst2) {
	         System.out.println(item);
	      }

	}
}
