import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC17S1 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int[] team1 = new int[N];
		int[] team2 = new int[N];
		String[] input = reader.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			team1[i] = Integer.parseInt(input[i]);
		}
		input = reader.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			team2[i] = Integer.parseInt(input[i]);
		}

		long sum1 = 0;
		long sum2 = 0;

		int K = 0;

		for (int i = 0; i < N; i++) {
			sum1 += team1[i];
			sum2 += team2[i];
			if (sum1 == sum2) {
				K = i + 1;
			}
		}

		System.out.println(K);

	}
}
