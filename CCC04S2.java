import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CCC04S2 {
	public static int[][] rank, scores;
	public static int[] holder;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		scores = new int[k][n];
		rank = new int[k][n];
		holder = new int[n];
		for (int i = 0; i < k; i++) {
			for (int ii = 0; ii < n; ii++) {
				scores[i][ii] = sc.nextInt();
			}
		}

		for (int i = 0; i < k; i++) {
			for (int ii = 0; ii < n; ii++) {
				holder[ii] += scores[i][ii];
			}
			// for (int ii = 0; ii < n; ii++) {
			// System.out.print(holder[ii] + " ");
			// }
			// System.out.println();
			giveRank(i);
			// for (int ii = 0; ii < n; ii++) {
			// System.out.print(rank[i][ii] + " ");
			// }
			// System.out.println();

		}
		ArrayList<Integer> index = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (rank[k - 1][i] == 1) {
				index.add(i);
			}
		}
		// System.out.println("index is: " + index + "\n\n\n");
		Collections.sort(index);
		for (int p = 0; p < index.size(); p++) {
			int minRank = 1;
			for (int i = 0; i < k; i++) {
				if (rank[i][index.get(p)] > minRank) {
					minRank = rank[i][index.get(p)];
				}
			}
			System.out.println("Yodeller " + (index.get(p) + 1) + " is the TopYodeller: score " + holder[index.get(p)]
					+ ", worst rank " + minRank);
		}
	}

	public static void giveRank(int k) {
		int[] temp = new int[holder.length];

		for (int i = 0; i < holder.length; i++) {
			temp[i] = holder[i];
		}

		Arrays.sort(temp);
		int rankCunt = 1;
		int repCunt = 0;
		for (int i = 0; i < holder.length; i++) {
			int sco = temp[holder.length - i - 1];
			for (int ii = 0; ii < holder.length; ii++) {
				if (holder[ii] == sco) {
					rank[k][ii] = rankCunt;
					repCunt++;
				}
			}
			// System.out.println("rank cunt is: " + rankCunt);
			// System.out.println("rep cunt is: " + repCunt);
			rankCunt += repCunt;
			i += repCunt - 1;
			repCunt = 0;
		}

	}
}
