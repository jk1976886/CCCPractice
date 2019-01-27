import java.util.Scanner;

public class CCC08J3 {

	public static char[][] keyboard = { { 'A', 'B', 'C', 'D', 'E', 'F' }, { 'G', 'H', 'I', 'J', 'K', 'L' },
			{ 'M', 'N', 'O', 'P', 'Q', 'R' }, { 'S', 'T', 'U', 'V', 'W', 'X' }, { 'Y', 'Z', ' ', '-', '.', 'e' } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		input += "e";
		char cur = 'A';
		char next;
		int counter = 0;
		for (int i = 0; i < input.length(); i++) {
			next = input.charAt(i);
			counter += move(cur, next);
			cur = next;
		}
		// counter++;
		System.out.println(counter);
	}

	public static int move(char cur, char next) {
		int temp = 0;
		int curR = 0, curC = 0, nextR = 0, nextC = 0;

		for (int i = 0; i < 5; i++) {
			for (int ii = 0; ii < 6; ii++) {
				if (keyboard[i][ii] == cur) {
					curR = i;
					curC = ii;
				}
				if (keyboard[i][ii] == next) {
					nextR = i;
					nextC = ii;
				}
			}
		}

		temp += Math.abs(curR - nextR) + Math.abs(curC - nextC);
		// System.out.println("temp form " + cur + " to " + next + " is :" + temp);
		return temp;

	}

}
