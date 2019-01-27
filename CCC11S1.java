import java.util.*;

public class CCC11S1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int SCounter = 0;
		int TCounter = 0;

		int lines = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < lines; i++) {
			// System.out.println("i is: " + i);
			String input = sc.nextLine();
	

			for (int ii = 0; ii < input.length(); ii++) {
				if (input.charAt(ii) == 't' || input.charAt(ii) == 'T') {
					TCounter++;
				} else if (input.charAt(ii) == 's' || input.charAt(ii) == 'S') {
					SCounter++;
				}
			}
		}

		if (TCounter > SCounter) {
			System.out.println("English");
		} else if(TCounter <= SCounter) {
			System.out.println("French");
		}

	}

}
