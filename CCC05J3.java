import java.util.Scanner;
import java.util.Stack;

public class CCC05J3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> input = new Stack<>();

		while (true) {
			String holder = sc.nextLine();
			if (holder.equals("SCHOOL")) {
				break;
			}
			input.push(holder);
		}

		while (!input.isEmpty()) {
			String direction = input.pop();
			if (direction.equals("L")) {
				direction = "RIGHT";
			} else {
				direction = "LEFT";
			}

			if (input.size() == 0) {
				System.out.println("Turn " + direction + " into your HOME.");
			} else {
				String street = input.pop();
				System.out.println("Turn " + direction + " onto " + street + " street.");
			}
		}

	}
}
