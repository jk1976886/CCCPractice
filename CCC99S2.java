import java.util.*;

public class CCC99S2 {
	public static ArrayList<String> months;
	public static String result;
jkjlkjlk
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] temp = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		months = new ArrayList<>();
		for (int i = 0; i < 12; i++) {
			months.add(temp[i]);
		}

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] split = line.split(" ");
			String out = "";
			result = "";
			for (int ii = 0; ii < split.length; ii++) {
				result = split[i];
				check(split[i]);
				out += result;
				if (ii != split.length - 1) {
					out += " ";
				}
			}
			System.out.println(out);

		}

	}

	public static void check(String s) {
		if (s.charAt(s.length() - 1) == ',') {
			check(s.substring(0, s.length() - 1));
			return;

		} else {
			if (s.length() == 8) {
				if (s.charAt(2) == '/' && s.charAt(5) == '/') {
					if (checkD(s.substring(0, 2)) && checkM(s.substring(3, 5)) && checkY(s.substring(6, s.length()))) {
						String temp = "";
						if (Integer.parseInt(s.substring(6)) < 25) {
							temp += "20";
						} else {
							temp += "19";
						}
						result = s.substring(0, 6) + temp + s.substring(6);
						return;
					}
				} else if (s.charAt(2) == ',' && s.charAt(5) == ',') {
					if (checkD(s.substring(0, 2)) && checkM(s.substring(3, 5)) && checkY(s.substring(6, s.length()))) {
						String temp = "";
						if (Integer.parseInt(s.substring(6)) < 25) {
							temp += "20";
						} else {
							temp += "19";
						}
						result = s.substring(0, 6) + temp + s.substring(6);
						return;
					}
				}

			} else {
				for (int i = 0; i < 12; i++) {
					if (s.length() - months.get(i).length() == 6) {
						if (s.charAt(months.get(i).length()) == ',' && s.charAt(months.get(i).length() + 3) == ',') {
							if (s.substring(0, months.get(i).length()) == months.get(i)
									&& checkD(s.substring(months.get(i).length() + 1, months.get(i).length() + 3))
									&& checkY(s.substring(months.get(i).length() + 5))) {
								String temp = "";
								if (Integer.parseInt(s.substring(months.get(i).length() + 5)) < 25) {
									temp += "20";
								} else {
									temp += "19";
								}
								result = s.substring(0, months.get(i).length() + 5) + temp
										+ s.substring(months.get(i).length() + 5);
								break;
							}
						}
					}
				}
			}
		}

	}

	public static boolean checkD(String s) {
		int temp = Integer.parseInt(s);
		return temp > 0 && temp < 99;
	}

	public static boolean checkM(String s) {
		int temp = Integer.parseInt(s);
		return temp > 0 && temp <= 12;
	}

	public static boolean checkY(String s) {
		int temp = Integer.parseInt(s);
		return temp > 0 && temp < 99;
	}
}
