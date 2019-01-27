package tempFolder;

import java.util.Scanner;

public class CCC15J3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		int[] vowel = { 97, 101, 105, 111, 117 };

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c != 97 && c != 101 && c != 105 && c != 111 && c != 117) {
				int dis = Integer.MAX_VALUE;
				for (int ii = 0; ii < 5; ii++) {
					if (Math.abs(c - vowel[ii]) < dis) {
						dis = Math.abs(c - vowel[ii]);
					}
				}

				if ((c - dis) == 97 || (c - dis) == 101 || (c - dis) == 105 || (c - dis) == 111 || (c - dis) == 117) {
					System.out.print((char) (c));
					System.out.print((char) (c - dis));
					if (c == 122) {
						System.out.print('z');
					} else {
						if ((c + 1) == 97 || (c + 1) == 101 || (c + 1) == 105 || (c + 1) == 111 || (c + 1) == 117) {
							System.out.print((char) (c + 2));
						} else {
							System.out.print((char) (c + 1));
						}
					}
				} else {
					System.out.print((char) (c));
					System.out.print((char) (c + dis));
					if (c == 122) {
						System.out.print('z');
					} else {
						if ((c + 1) == 97 || (c + 1) == 101 || (c + 1) == 105 || (c + 1) == 111 || (c + 1) == 117) {
							System.out.print((char) (c + 2));
						} else {
							System.out.print((char) (c + 1));
						}
					}
				}

			} else {
				System.out.print(c);
			}

		}

	}
}
