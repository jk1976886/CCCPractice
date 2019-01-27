package tempFolder;

import java.util.Scanner;

public class CCC97S1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int subjects = sc.nextInt();
			int verbs = sc.nextInt();
			int objects = sc.nextInt();

			String[] subject = new String[subjects];
			String[] verb = new String[verbs];
			String[] object = new String[objects];
			sc.nextLine();
			for (int ii = 0; ii < subjects; ii++) {
				subject[ii] = sc.nextLine();
			}

			for (int ii = 0; ii < verbs; ii++) {
				verb[ii] = sc.nextLine();
			}

			for (int ii = 0; ii < objects; ii++) {
				object[ii] = sc.nextLine();
			}

			for (int a = 0; a < subjects; a++) {
				for (int b = 0; b < verbs; b++) {
					for (int c = 0; c < objects; c++) {
						System.out.println(subject[a] + " " + verb[b] + " " + object[c] + ".");
					}
				}
			}

		}

	}
}
