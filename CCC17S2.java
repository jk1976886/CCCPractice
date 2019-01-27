import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CCC17S2 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());
		int[] input = new int[N];
		String[] line = reader.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(line[i]);
		}

		Arrays.sort(input);

		if (N % 2 == 0) {
			Stack<Integer> low = new Stack<>();
			for (int i = 0; i < N / 2; i++) {
				low.push(input[i]);
			}
			for (int i = N / 2; i < N; i++) {
				System.out.print(low.pop() + " ");
				if (i == N - 1) {
					System.out.print(input[i]);
				} else {
					System.out.print(input[i] + " ");
				}
			}
		} else {
			Stack<Integer> low = new Stack<>();
			for (int i = 0; i <= N / 2; i++) {
				low.push(input[i]);
			}
			System.out.print(low.pop());
			for (int i = N / 2 + 1; i < N; i++) {

				System.out.print(" " + input[i]);
				System.out.print(" " + low.pop());
			}
		}

	}

}