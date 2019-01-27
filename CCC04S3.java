import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CCC04S3 {

	// indegree = points depend on the current point
	// outdegree = current point depends on those points
	public static Map<Integer, ArrayList<Integer>> indegree = new HashMap<>();
	public static Map<Integer, ArrayList<Integer>> outdegree = new HashMap<>();

	// top stores the number of indegree
	public static int[] top = new int[90];
	public static int[][] grid = new int[10][9];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			for (int ii = 0; ii < 9; ii++) {
				grid[i][ii] = Integer.MIN_VALUE;
			}
		}

		for (int i = 0; i < 10; i++) {
			String line = sc.nextLine();
			// System.out.println(line);
			String[] term = line.split(" ");
			for (int ii = 0; ii < 9; ii++) {
				int index = 9 * i + ii;
				if (!indegree.containsKey(index)) {
					indegree.put(index, new ArrayList<>());
				}
				if (!outdegree.containsKey(index)) {
					outdegree.put(index, new ArrayList<>());
				}
				try {
					int number = Integer.parseInt(term[ii]);
					grid[i][ii] = number;
					top[index] = 0;

				} catch (Exception e) {
					String[] cells = split(term[ii]);

					for (String s : cells) {
						int tempRow = getRow(s);
						int tempCol = getCol(s);
						int tempIndex = tempRow * 9 + tempCol;
						outdegree.get(index).add(tempIndex);

						if (!indegree.containsKey(tempIndex)) {
							indegree.put(tempIndex, new ArrayList<>());
						}

						indegree.get(tempIndex).add(index);
						top[index]++;
					}
				}
			}
		}

		// debug();
		while (true) {
			ArrayList<Integer> temp = findZero();
			if (temp.size() == 0) {
				break;
			}

			for (int index : temp) {
				assign(index);
			}
		}
		// print
		for (int i = 0; i < 10; i++) {
			for (int ii = 0; ii < 9; ii++) {
				if (grid[i][ii] == Integer.MIN_VALUE) {
					System.out.print('*');
				} else {
					System.out.print(grid[i][ii]);
				}

				if (ii != 8) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static int getRow(String co) {
		return (int) (co.charAt(0)) - 65;
	}

	public static int getCol(String co) {
		return Integer.parseInt(Character.toString(co.charAt(1))) - 1;
	}

	public static String[] split(String input) {
		String[] holder = new String[10];
		int counter = 0;
		for (int i = 0; i < input.length(); i += 3) {
			holder[i / 3] = input.substring(i, i + 2);
			counter++;
		}
		String[] ans = new String[counter];
		for (int i = 0; i < counter; i++) {
			ans[i] = holder[i];
		}
		return ans;
	}

	public static ArrayList<Integer> findZero() {
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < 90; i++) {
			if (top[i] == 0) {
				temp.add(i);
			}
		}
		return temp;
	}

	public static void assign(int index) {
		// not pre-assigned
		if (grid[index / 9][index % 9] == Integer.MIN_VALUE) {
			int sum = 0;
			for (int tempIndex : outdegree.get(index)) {
				sum += grid[tempIndex / 9][tempIndex % 9];

			}

			grid[index / 9][index % 9] = sum;
		}

		if (indegree.containsKey(index)) {
			for (int tempIndex : indegree.get(index)) {
				top[tempIndex]--;
			}
		}

		top[index] = -1;
	}

	public static void debug() {
		System.out.println("\n\nhere's the indegree:");
		for (int i = 0; i < 90; i++) {
			System.out.print((i / 9) + " , " + (i % 9) + ": ");
			if (indegree.containsKey(i)) {
				for (int tempIndex : indegree.get(i)) {
					System.out.print((tempIndex / 9) + " , " + (tempIndex % 9) + " ; ");
				}
			}
			System.out.println();
		}

		System.out.println("\n\nhere's the outdegree:");
		for (int i = 0; i < 90; i++) {
			System.out.print((i / 9) + " , " + (i % 9) + ": ");
			if (outdegree.containsKey(i)) {
				for (int tempIndex : outdegree.get(i)) {
					System.out.print((tempIndex / 9) + " , " + (tempIndex % 9) + " ; ");
				}
			}
			System.out.println();
		}
	}
}
