import java.util.*;

public class CCC06S1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String mom = sc.next();
		String dad = sc.next();
		int n = sc.nextInt();
		String[] babies = new String[n];
		String possBab = "";

		for (int i = 0; i < n; i++) {

			babies[i] = sc.next();

		}

		for (int i = 0; i < 10; i += 2) {

			if (mom.charAt(i) == 'A' + i / 2 && mom.charAt(i + 1) == 'A' + i / 2
					|| dad.charAt(i) == 'A' + i / 2 && dad.charAt(i + 1) == 'A' + i / 2) {
				possBab += Character.toString((char) ('A' + i / 2));

			} else if (mom.charAt(i) == 'a' + i / 2 && mom.charAt(i + 1) == 'a' + i / 2 && dad.charAt(i) == 'a' + i / 2
					&& dad.charAt(i + 1) == 'a' + i / 2) {
				possBab += Character.toString((char) ('a' + i / 2));
			} else {
				possBab += "x";

			}

		}

		int counter = 0;

		for (int i = 0; i < n; i++) {

			for (int ii = 0; ii < 5; ii++) {
				if (possBab.charAt(ii) == 'x' || possBab.charAt(ii) == babies[i].charAt(ii)) {
					counter++;
				}
			}

			if (counter == 5) {
				System.out.println("Possible baby.");
			} else {
				System.out.println("Not their baby!");
			}

			counter = 0;
		}

	}

}
