import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CCC07S4 {
	public static int[] dp;
	public static Map<Integer, ArrayList<Integer>> map;

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());
		dp = new int[n];
		map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}
		String[] line;

		while (true) {
			line = reader.readLine().split(" ");
			if (line[0].equals("0") && line[1].equals("0")) {
				break;
			}
			map.get(Integer.parseInt(line[0]) - 1).add(Integer.parseInt(line[1]) - 1);
		}

		dp[0] = 1;

		for (int i = 0; i < n; i++) {
			for (int j : map.get(i)) {
				dp[j] += dp[i];
			}
		}

		System.out.println(dp[n - 1]);
	}

}
