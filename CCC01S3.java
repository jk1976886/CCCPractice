import java.util.*;

public class CCC01S3 {

	public static int[][] map;
	public static ArrayList<String> bridge;
	public static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new int[26][26];
		bridge = new ArrayList<>();

		while (true) {
			String input = sc.nextLine();
			if (input.equals("**")) {
				break;
			}
			map[(int) (input.charAt(0)) - 65][(int) (input.charAt(1)) - 65] = 1;
			map[(int) (input.charAt(1)) - 65][(int) (input.charAt(0)) - 65] = 1;

		}

		for (int i = 0; i < 26; i++) {
			for (int ii = i + 1; ii < 26; ii++) {
				if (map[i][ii] == 1) {
					map[i][ii] = 0;
					map[ii][i] = 0;
					visited = new boolean[26];
					for (int iii = 0; iii < 26; iii++) {
						visited[iii] = false;
					}
					dfs(0);
					if (!visited[1]) {
						String holder = "";
						holder += (char) (i + 65);
						holder += (char) (ii + 65);
						bridge.add(holder);
					}
					map[i][ii] = 1;
					map[ii][i] = 1;
				}
			}
		}
		if (bridge.size() == 0) {
			System.out.println("There are 0 disconnecting roads.");
		} else {
			for (String s : bridge) {
				System.out.println(s);
			}
			System.out.println("There are " + bridge.size() + " disconnecting roads.");
		}

	}

	public static void dfs(int cur) {
		visited[cur] = true;
		for (int i = 0; i < 26; i++) {
			if (map[cur][i] > 0 && !visited[i]) {
				dfs(i);
			}
		}
	}
}
