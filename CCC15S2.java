import java.util.*;

public class CCC15S2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int J = sc.nextInt();
		int A = sc.nextInt();
		int[] input = new int[J];
		int counter = 0;
		// int counter2 = 0;

		for (int i = 0; i < J; i++) {
			input[i] = sc.next().charAt(0);
		}

		for (int i = 0; i < A; i++) {
			int size = sc.next().charAt(0);
			int number = sc.nextInt() - 1;
			if (input[number] <= size) {
				// System.out.println(number + " fits " + input.get(number) );
				input[number] = 100;
				counter++;
			}
		}

		System.out.println(counter);
	}

}
