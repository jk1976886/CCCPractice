import java.util.*;

public class CCC05S1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String rawInput = sc.next();
			String input = "";
			int[] nums = new int[10];
			for (int ii = 0; ii < rawInput.length(); ii++) {
				if (rawInput.charAt(ii) != '-') {
					input += rawInput.charAt(ii);
				}
			}
			input = input.substring(0, 10);

			for (int ii = 0; ii < 10; ii++) {
				if (input.charAt(ii) == 'A' || input.charAt(ii) == 'B' || input.charAt(ii) == 'C') {
					nums[ii] = 2;
				} else if (input.charAt(ii) == 'D' || input.charAt(ii) == 'E' || input.charAt(ii) == 'F') {
					nums[ii] = 3;
				} else if (input.charAt(ii) == 'G' || input.charAt(ii) == 'H' || input.charAt(ii) == 'I') {
					nums[ii] = 4;
				} else if (input.charAt(ii) == 'J' || input.charAt(ii) == 'K' || input.charAt(ii) == 'L') {
					nums[ii] = 5;
				} else if (input.charAt(ii) == 'M' || input.charAt(ii) == 'N' || input.charAt(ii) == 'O') {
					nums[ii] = 6;
				} else if (input.charAt(ii) == 'P' || input.charAt(ii) == 'Q' || input.charAt(ii) == 'R'
						|| input.charAt(ii) == 'S') {
					nums[ii] = 7;
				} else if (input.charAt(ii) == 'T' || input.charAt(ii) == 'U' || input.charAt(ii) == 'V') {
					nums[ii] = 8;
				} else if (input.charAt(ii) == 'W' || input.charAt(ii) == 'X' || input.charAt(ii) == 'Y'
						|| input.charAt(ii) == 'Z') {
					nums[ii] = 9;
				} else {
					nums[ii] = Integer.parseInt(Character.toString(input.charAt(ii)));
				}

			}

			for (int ii = 0; ii < 10; ii++) {

				System.out.print(nums[ii]);

				if (ii == 2 || ii == 5) {
					System.out.print("-");
				}
			}
			System.out.println();
		}

	}
}
