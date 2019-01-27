import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CCC16S3 {
	public static Map<Integer, ArrayList<Integer>> adjList;
	public static int N, M, E;
	public static boolean[] marked;
	public static int[] dist;

	public static void mark(int cur, int pre) {
		for (int i : adjList.get(cur)) {
			if (i != pre) {
				mark(i, cur);

				if (marked[i]) {
					marked[cur] = marked[i];
					E++;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		adjList = new HashMap<>();
		N = sc.nextInt();
		M = sc.nextInt();
		E = 0;
		dist = new int[N];
		marked = new boolean[N];

		int lastPho = -1;
		for (int i = 0; i < M; i++) {
			marked[lastPho = sc.nextInt()] = true;
		}

		adjList = new HashMap<>();
		for (int i = 0; i < N; i++) {
			adjList.put(i, new ArrayList<>());
		}

		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			adjList.get(a).add(b);
			adjList.get(b).add(a);
		}

		// find needed node
		mark(lastPho, -1);

		// dist[lastPho] = 0;
		findDist(lastPho, -1);

		int d = lastPho;
		// find one side
		for (int i = 0; i < dist.length; i++) {
			if (dist[i] > dist[d]) {
				d = i;
			}
		}

		dist = new int[N];
		findDist(d, -1);
		int dd = d;

		for (int i = 0; i < dist.length; i++) {
			if (dist[i] > dist[dd]) {
				dd = i;
			}
		}
		System.out.println((E * 2) - dist[dd]);
	}

	public static void findDist(int cur, int pre) {
		for (int i : adjList.get(cur)) {
			if (i != pre && marked[i]) {
				dist[i] = dist[cur] + 1;
				findDist(i, cur);
			}
		}
	}

}
