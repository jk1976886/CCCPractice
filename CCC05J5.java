import java.util.*;

public class CCC05J5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.next();
			if (input.equals("X")) {
				break;
			} else {
				if (check(input)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		}

	}

	public static boolean check(String input) {
		if (input.length() == 0) {
			return false;
		} else if (input.equals("A")) {
			return true;
		} else if (input.length() == 1) {
			return false;

		} else if (input.charAt(0) == 'B') {

			if (input.charAt(input.length() - 1) == 'S' && check(input.substring(1, input.length() - 1))) {
				return true;
			} else {
				int tempCounter = 0;
				ArrayList<Integer> SCounter = new ArrayList<Integer>();
				for (int i = input.length() - 2; i >= 0; i--) {
					if (input.charAt(i) == 'S') {
						SCounter.add(i);
					}
				}
				if (SCounter == null || SCounter.size() == 0) {
					return false;
				} else {
					for (int i = 0; i < SCounter.size(); i++) {

						if (input.charAt(SCounter.get(i) + 1) == 'N') {
							if (check(input.substring(0, SCounter.get(i) + 1))
									&& check(input.substring(SCounter.get(i) + 2, input.length()))) {
								tempCounter++;
								break;
							}
						}

					}
					if (tempCounter == 0) {
						return false;
					} else {
						return true;
					}
				}
			}
		} else if (input.charAt(0) == 'A') {
			if (input.charAt(1) == 'N') {
				return check(input.substring(2, input.length()));
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
