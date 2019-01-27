import java.util.*;

public class CCC15S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Integer> input = new Stack<Integer>();

		int K = sc.nextInt();
		int counter = 0;
		for (int i = 0; i < K; i++) {
			// System.out.println("i is: " + i);
			int temp = sc.nextInt();
			if (i != 0 && temp == 0) {
				// System.out.println("popping:" + input.peek());
				input.pop();
				counter += 2;
			} else {

				input.push(temp);
				// System.out.println("pushing:" + input.peek());
			}
		}

		int sum = 0;
		// System.out.println("calculating sum");
		for (int i = 0; i < K - counter; i++) {

			sum += input.pop();

		}

		System.out.println(sum);

	}

}
