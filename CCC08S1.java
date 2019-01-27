import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CCC08S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] temp = new int[10000];
		int counter = 0;
		HashMap<Integer, String> input = new HashMap<Integer, String>();
		while (true) {
			String name = sc.next();
			int tempera = sc.nextInt();
			if (name.equals("Waterloo")) {
				input.put(tempera, name);
				temp[counter] = tempera;
				break;
			} else {
				input.put(tempera, name);
				temp[counter] = tempera;
				counter++;
			}

		}
		
		Arrays.sort(temp);
		
		System.out.println(input.get(temp[0]));
		
		
		
	}

}
