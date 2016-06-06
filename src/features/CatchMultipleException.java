package features;


public class CatchMultipleException {

	public static void main(String[] args) {
		//	For example, before JDK 7, you need three catch blocks to catch three exception types although both perform identical task:
		try {
		    Class.forName("Object").newInstance();
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		} catch (InstantiationException e) {
		    e.printStackTrace();
		} catch (IllegalAccessException e) {
		    e.printStackTrace();
		}
	
		//In JDK7, you can collapse the catch blocks into a single one:
		try {
		    Class.forName("Object").newInstance();
		} catch (ClassNotFoundException | InstantiationException |IllegalAccessException e) {
		    e.printStackTrace();
		}
	}
}
