package tempFolder;

import java.util.Scanner;

public class CCC98S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {

			String input = sc.nextLine();
			String[] words = input.split(" ");

			for (int ii = 0; ii < words.length; ii++) {

				if (words[ii].length() == 4) {
					System.out.print("****");
				} else {
					System.out.print(words[ii]);
				}
				if (!(ii == (words.length - 1))) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
