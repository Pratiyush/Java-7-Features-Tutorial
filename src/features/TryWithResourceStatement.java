package features;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResourceStatement {

	public static void main(String[] args) {
		/*The try-with-resources Statement
		For example, before JDK 7, we need to use a finally block,
		to ensure that a resource is closed regardless of whether 
		the try statement completes normally or abruptly. The code is messy!*/
		fileCopyJDK7();	
		fileCopyPreJDK7();
	}

	// Copy from one file to another file character by character.
	// JDK 7 has a try-with-resources statement, which ensures that
	// each resource opened in try() is closed at the end of the statement.
	private static void fileCopyJDK7() {
		  try (BufferedReader in  = new BufferedReader(new FileReader("in.txt"));
		           BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"))) {
		         int charRead;
		         while ((charRead = in.read()) != -1) {
		            System.out.printf("%c ", (char)charRead);
		            out.write(charRead);
		         }
		      } catch (IOException ex) {
		         ex.printStackTrace();
		      }
	}

	// Copy from one file to another file character by character.
	// Pre-JDK 7 requires you to close the resources using a finally block.
	// See fileCopyJDK7()
	private static void fileCopyPreJDK7 () {
		  BufferedReader in = null;
	      BufferedWriter out = null;
	      try {
	         in  = new BufferedReader(new FileReader("in.txt"));
	         out = new BufferedWriter(new FileWriter("out.txt"));
	         int charRead;
	         while ((charRead = in.read()) != -1) {
	            System.out.printf("%c ", (char)charRead);
	            out.write(charRead);
	         }
	      } catch (IOException ex) {
	         ex.printStackTrace();
	      } finally {            // always close the streams
	         try {
	            if (in != null) in.close();
	            if (out != null) out.close();
	         } catch (IOException ex) {
	            ex.printStackTrace();
	         }
	      }
	 
	      try {
	         in.read();   // Trigger IOException: Stream closed
	      } catch (IOException ex) {
	         ex.printStackTrace();
	      }
	}
}
