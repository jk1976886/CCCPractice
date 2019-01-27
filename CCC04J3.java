import java.util.Scanner;

public class CCC04J3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		String[] adj = new String[a];
		String[] noun = new String[b];
		sc.nextLine();
		for (int i = 0; i < a; i++) {
			adj[i] = sc.nextLine();
		}
		for (int i = 0; i < b; i++) {
			noun[i] = sc.nextLine();
		}

		for (int i = 0; i < a; i++) {
			for (int ii = 0; ii < b; ii++) {
				System.out.println(adj[i] + " as " + noun[ii]);
			}
		}

	}
}
