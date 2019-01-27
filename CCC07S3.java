import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CCC07S3 {
	public static Map<Integer, Integer> map;
	public static ArrayList<Integer> student, temp;
	public static Set<Integer> visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		map = new HashMap<>();
		student = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			student.add(a);
			map.put(a, b);
		}

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) {
				break;
			}

			visited = new HashSet<>();
			temp = new ArrayList<>();

			if (map.containsKey(a)) {
				search(a, map.get(a));
			}
			int counter = 0;
			boolean found = false;
			for (int i = 0; i < temp.size(); i++) {
				if (temp.get(i) == b) {
					found = true;
					break;
				}
				counter++;
			}
			if (found) {
				System.out.println("Yes " + counter);
			} else {
				System.out.println("No");
			}

		}
	}

	public static void search(int root, int cur) {
		if (map.containsKey(cur)) {
			if (cur == root) {
				return;
			} else {
				visited.add(cur);
				temp.add(cur);
				if (!visited.contains(map.get(cur))) {
					search(root, map.get(cur));
				}
			}
		}

		return;

		/*
		 * int b; if (map.containsKey(map.get(cur))) { b = map.get(cur); } else {
		 * return; } if (b == root) { return; } search(root, b)
		 */

	}

}
