import java.util.*;

public class CCC05S4 {
	public static HashMap<String, ArrayList<String>> map;
	public static Set<String> visit;
	public static int level;

	public static void dfs(String s, int counter) {
		// System.out.println(s + " counter: " + counter);
		visit.add(s);
		boolean change = false;

		for (String name : map.get(s)) {
			if (!visit.contains(name)) {
				dfs(name, counter + 1);
				change = true;
			}
		}
		if (!change) {
			if (counter > level) {
				level = counter;
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();

		for (int i = 0; i < L; i++) {
			int n = sc.nextInt();
			sc.nextLine();
			String root = "";
			visit = new HashSet<>();
			map = new HashMap<>();
			level = 0;
			for (int ii = 0; ii < n / 2; ii++) {
				String name1 = sc.nextLine();
				String name2 = sc.nextLine();
				if (ii == n / 2 - 1) {
					root = name2;
				}
				if (!map.containsKey(name1)) {
					map.put(name1, new ArrayList<String>());
				}
				if (!map.containsKey(name2)) {
					map.put(name2, new ArrayList<String>());
				}
				map.get(name1).add(name2);
				map.get(name2).add(name1);
			}
			dfs(root, 0);
			System.out.println(n * 10 - level * 20);
		}

	}
}
