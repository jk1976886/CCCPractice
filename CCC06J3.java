import java.util.*;

public class CCC06J3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String type = sc.next();
			int time = 0;
			int[] key = new int[type.length()];
			if (type.equals("halt")) {
				break;
			}

			for (int i = 0; i < type.length(); i++) {
				if (type.charAt(i) == 'a') {
					key[i] = 2;
				} else if (type.charAt(i) == 'b') {
					key[i] = 2;
					time++;
				} else if (type.charAt(i) == 'c') {
					key[i] = 2;
					time += 2;
				} else if (type.charAt(i) == 'd') {
					key[i] = 3;
				} else if (type.charAt(i) == 'e') {
					key[i] = 3;
					time++;
				} else if (type.charAt(i) == 'f') {
					key[i] = 3;
					time += 2;
				} else if (type.charAt(i) == 'g') {
					key[i] = 4;
				} else if (type.charAt(i) == 'h') {
					key[i] = 4;
					time++;
				} else if (type.charAt(i) == 'i') {
					key[i] = 4;
					time += 2;
				} else if (type.charAt(i) == 'j') {
					key[i] = 5;
				} else if (type.charAt(i) == 'k') {
					key[i] = 5;
					time++;
				} else if (type.charAt(i) == 'l') {
					key[i] = 5;
					time += 2;
				} else if (type.charAt(i) == 'm') {
					key[i] = 6;
				} else if (type.charAt(i) == 'n') {
					key[i] = 6;
					time++;
				} else if (type.charAt(i) == 'o') {
					key[i] = 6;
					time += 2;
				} else if (type.charAt(i) == 'p') {
					key[i] = 7;
				} else if (type.charAt(i) == 'q') {
					key[i] = 7;
					time++;
				} else if (type.charAt(i) == 'r') {
					key[i] = 7;
					time += 2;
				} else if (type.charAt(i) == 's') {
					key[i] = 7;
					time += 3;
				} else if (type.charAt(i) == 't') {
					key[i] = 8;
				} else if (type.charAt(i) == 'u') {
					key[i] = 8;
					time++;
				} else if (type.charAt(i) == 'v') {
					key[i] = 8;
					time += 2;
				} else if (type.charAt(i) == 'w') {
					key[i] = 9;
				} else if (type.charAt(i) == 'x') {
					key[i] = 9;
					time++;
				} else if (type.charAt(i) == 'y') {
					key[i] = 9;
					time += 2;
				} else if (type.charAt(i) == 'z') {
					key[i] = 9;
					time += 3;
				}
			}
			
			time++;
			for (int i = 1; i < type.length(); i++) {
				if (key[i] == key[i - 1]) {
					time += 2;
				}
				time++;
			}

			System.out.println(time);

		}

	}

}
