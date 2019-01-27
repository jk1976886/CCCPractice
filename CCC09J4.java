import java.util.*;

public class CCC09J4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();

		String[] word = { "WELCOME", "TO", "CCC", "GOOD", "LUCK", "TODAY" };
		int wordCunt = 0;
		int index = 0;

		while (wordCunt < 6) {
			int letCunt = 0;

			for (int i = index; i < 6; i++) {
				letCunt += word[i].length();
				wordCunt++;
				if (letCunt > w) {
					letCunt -= word[i].length();
					letCunt--;
					wordCunt--;
					break;
				} else if (letCunt == w) {
					break;
				}
				if (i != 5) {
					letCunt++;
				}

			}

			int extra = w - letCunt;
			// System.out.println(extra);
			if (extra == 0) {

				for (int i = index; i < wordCunt - 1; i++) {
					System.out.print(word[i]);
					System.out.print(".");
				}
				System.out.print(word[wordCunt - 1]);
				System.out.println();
			} else {
				int gap = wordCunt - index - 1;
				if (gap == 0) {
					System.out.print(word[index]);
					for (int i = 0; i < extra; i++) {
						System.out.print(".");
					}
					System.out.println();
				} else {
					int[] gaps = new int[gap];
					for (int i = 0; i <= gap; i++) {
						if (i == gap) {
							i = 0;
						}
						if (extra == 0) {
							break;
						}
						gaps[i]++;
						extra--;

					}
					int counter = 0;
					for (int i = index; i < wordCunt - 1; i++) {
						System.out.print(word[i]);
						System.out.print(".");
						;
						try {
							for (int ii = 0; ii < gaps[counter]; ii++) {
								System.out.print(".");
							}
							counter++;
						} catch (Exception e) {

						}
					}
					System.out.println(word[wordCunt - 1]);
				}
			}

			// System.out.println(letCunt);
			index = wordCunt;
		}

	}

}
