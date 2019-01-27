import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CCC12S3 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());
		int[] R = new int[1001];
		int maxFreq = 0;
		for (int i = 0; i < N; i++) {
			int r = Integer.parseInt(reader.readLine());
			R[r]++;
			if (R[r] > maxFreq) {
				maxFreq = R[r];
			}
		}

		ArrayList<Integer> maxFreqR = new ArrayList<>();

		int nextFreq = 0;
		int nextFreqMax = 0;
		int nextFreqMin = 1001;

		for (int i = 1; i <= 1000; i++) {
			if (R[i] == maxFreq) {
				maxFreqR.add(i);
			} else if (R[i] < maxFreq) {
				if (R[i] > nextFreq) {
					nextFreqMax = i;
					nextFreqMin = i;
					nextFreq = R[i];
				} else if (R[i] == nextFreq) {
					if (i > nextFreqMax) {
						nextFreqMax = i;
					}
					if (i < nextFreqMin) {
						nextFreqMin = i;
					}
				}
			}
		}

		if (maxFreqR.size() == 1) {
			System.out.println(
					Math.max(Math.abs(nextFreqMax - maxFreqR.get(0)), Math.abs(nextFreqMin - maxFreqR.get(0))));
		} else {
			Collections.sort(maxFreqR);
			System.out.println(maxFreqR.get(maxFreqR.size() - 1) - maxFreqR.get(0));
		}

	}
}
