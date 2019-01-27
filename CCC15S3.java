import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CCC15S3 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int G = Integer.parseInt(reader.readLine());
		int P = Integer.parseInt(reader.readLine());

		int counter = 0;
		int[] plane = new int[P];
		int[] arrIn = new int[G];
		boolean[] arr = new boolean[G];

		for (int i = 0; i < G; i++) {
			arrIn[i] = i;
		}

		for (int i = 0; i < P; i++) {
			plane[i] = Integer.parseInt(reader.readLine()) - 1;
		}

		for (int i = 0; i < P; i++) {
			boolean change = false;
			int index = arrIn[plane[i]];

			while (index >= 0) {
				if (!arr[index]) {
					arr[index] = true;
					change = true;
					arrIn[plane[i]]--;
					break;
				}
				index--;
			}

			if (change) {
				counter++;
			} else {
				break;
			}

		}
		System.out.println(counter);

	}
}
