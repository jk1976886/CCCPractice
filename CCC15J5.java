import java.util.Scanner;

public class CCC15J5 {
	public static int ppl, pie;
	public static int[][][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pie = sc.nextInt();
		ppl = sc.nextInt();
		dp = new int[ppl + 1][pie + 1][pie + 1];

		for (int i = 0; i <= ppl; i++) {
			for (int ii = 0; ii <= pie; ii++) {
				for (int iii = 0; iii <= pie; iii++) {
					dp[i][ii][iii] = -1;
				}
			}
		}

		System.out.println(dis(ppl, pie, 1));

	}

	public static int dis(int pplLeft, int pieLeft, int prev) {
		if (pplLeft == 0) {
			if (pieLeft == 0) {
				return 1;
			}
			return 0;
		}

		if (pieLeft <= 0) {
			return 0;
		}

		if (dp[pplLeft][pieLeft][prev] != -1) {
			return dp[pplLeft][pieLeft][prev];
		}

		int ans = 0;

		for (int i = prev; i <= pieLeft; i++) {
			ans += dis(pplLeft - 1, pieLeft - i, i);
		}

		dp[pplLeft][pieLeft][prev] = ans;
		return ans;

	}
}
