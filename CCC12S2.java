import java.util.*;

public class CCC12S2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		int ans = 0;
		int[] term = new int[input.length()];
		int counter = 0;

		for (int i = 0; i < input.length(); i += 2) {
			term[i] = Integer.parseInt(Character.toString(input.charAt(i)));
			char rom = input.charAt(i + 1);

			if (rom == 'I') {
				term[i + 1] = 1;
			} else if (rom == 'V') {
				term[i + 1] = 5;
			} else if (rom == 'X') {
				term[i + 1] = 10;
			} else if (rom == 'L') {
				term[i + 1] = 50;
			} else if (rom == 'C') {
				term[i + 1] = 100;
			} else if (rom == 'D') {
				term[i + 1] = 500;
			} else if (rom == 'M') {
				term[i + 1] = 1000;
			}

		}

		for (int i = 0; i < term.length - 2; i += 2) {

			if (term[i + 1] < term[i + 3]) {
				ans -= term[i] * term[i + 1];
			} else {
				ans += term[i] * term[i + 1];
			}

		}
		ans += term[term.length - 2] * term[term.length - 1];

		System.out.println(ans);

	}

}
