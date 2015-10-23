import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Tobias
 *
 */


public class HelloUser {
	
	
		static String userName;
		
		
		public static void greetUser(String u) {
			System.out.println("Hello " + u + " !");
		}
		

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Hello ASE2015 - how are you? now :)");
		System.out.print("Please enter your name: ");
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		userName = tastatur.readLine(); 
		greetUser(userName);
	}

}
