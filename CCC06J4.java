import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CCC06J4 {
	public static Map<Integer, ArrayList<Integer>> map;
	public static ArrayList<Integer> ans, temp;
	public static int[][] top;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] temp1 = { 1, 1, 2, 3, 3 };
		int[] temp2 = { 7, 4, 1, 4, 5 };
		map = new HashMap<>();
		top = new int[8][2];
		for (int i = 0; i < temp1.length; i++) {
			add(temp1[i], temp2[i]);
		}

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) {
				break;
			}

			add(a, b);

		}
		// debug();
		ans = new ArrayList<>();
		temp = new ArrayList<>();
		while (true) {
			find();
			if (temp.size() == 0) {
				break;
			}
			// System.out.print("temp :");
			// for (int i : temp) {
			// System.out.print(i + " ");
			// }
			// System.out.println();
			ans.add(temp.get(0));

			if (map.containsKey(temp.get(0))) {
				for (int ii : map.get(temp.get(0))) {
					top[ii][0]--;
				}
			}
			temp.remove(0);
		}
		// System.out.println("OUT");
		if (ans.size() == 7) {
			for (int i = 0; i < 7; i++) {
				System.out.print(ans.get(i));
				if (i != 6) {
					System.out.print(" ");
				}
			}
		} else {
			System.out.println("Cannot complete these tasks. Going to bed.");
		}

	}

	public static void debug() {
		for (int i = 1; i <= 7; i++) {
			if (map.containsKey(i)) {
				System.out.print(i + ": ");
				for (int ii : map.get(i)) {
					System.out.print(ii + " ");
				}
				System.out.println();
			}
		}
	}

	public static void find() {
		// ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 1; i <= 7; i++) {
			if (top[i][0] == 0) {
				temp.add(i);

				top[i][0]--;
			}
		}
		Collections.sort(temp);

	}

	public static void add(int a, int b) {
		if (!map.containsKey(a)) {
			map.put(a, new ArrayList<Integer>());
		}
		map.get(a).add(b);

		top[b][0]++;
		top[a][1]++;
	}

}
