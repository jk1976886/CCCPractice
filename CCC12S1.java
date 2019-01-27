import java.util.*;

public class CCC12S1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt() - 3;
		int ans = 0;
		
		for(int i = num; i>0; i--) {
			for(int ii = i; ii>0; ii--) {
				ans+=ii;
			}
		}
		
		System.out.println(ans);
		
	}

}
