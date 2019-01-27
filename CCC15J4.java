package tempFolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CCC15J4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();
		ArrayList<Integer> names = new ArrayList<Integer>();
		int num = sc.nextInt();
		sc.nextLine();
		int time = 0;

		for (int i = 0; i < num; i++) {
			String line = sc.nextLine();
			char stat = line.charAt(0);
			int fr = Integer.parseInt(line.substring(2, line.length()));
			if (stat == 'W') {
				time += fr - 1;
			} else if (stat == 'R') {
				if (!names.contains(fr)) {
					names.add(fr);
				}
				list.put(fr, time);
				if (sum.containsKey(fr)) {
					sum.put(fr, sum.get(fr));
				} else {
					sum.put(fr, 0);
				}
				time++;

			} else {

				sum.put(fr, sum.get(fr) + time - list.get(fr));
				list.put(fr, 0);
				time++;

			}
		}
		names.sort(null);
		for (int i = 0; i < sum.size(); i++) {
			if (list.get(names.get(i)) != 0) {
				System.out.println(names.get(i) + " -1");
			} else {
				System.out.println(names.get(i) + " " + sum.get(names.get(i)));
			}
		}

	}
}
