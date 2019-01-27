import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


















//TLE but F this shit I am out :)






















public class CCC00S3 {
	public static Map<Integer, ArrayList<Integer>> map;
	public static ArrayList<String> domain;
	public static boolean[] visited;

	public static void main(String[] args) throws Exception {
		// Scanner sc = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		map = new HashMap<Integer, ArrayList<Integer>>();
		domain = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			String tempD = reader.readLine();
			if (!domain.contains(tempD)) {
				domain.add(tempD);
			}
			if (!map.containsKey(domain.indexOf(tempD))) {
				map.put(domain.indexOf(tempD), new ArrayList<Integer>());
			}
			// System.out.println("tempD: " + tempD);
			while (true) {
				String line = reader.readLine();
				if (line.equals("</HTML>")) {
					break;
				}

				for (int ii = 0; ii < line.length() - 2; ii++) {
					if (line.charAt(ii) == '<' && line.charAt(ii + 1) == 'A') {
						if (ii + 8 < line.length() - 2) {
							int index = ii + 2;
							boolean valid = false;
							if (line.charAt(index) == ' ') {
								index++;
							}

							if (line.substring(index, index + 6).equals("HREF=\"")) {
								valid = true;
								index += 6;
							}

							if (valid) {
								String holder = "";

								while (true) {
									if (line.charAt(index) == '\"' || !(index < line.length())) {
										break;
									}

									holder += line.charAt(index);
									index++;
								}
								if (!domain.contains(holder)) {
									domain.add(holder);
									// System.out.println("add: " + holder + " into DOMAIN");
								}
								if (!map.containsKey(domain.indexOf(holder))) {
									map.put(domain.indexOf(holder), new ArrayList<Integer>());
								}
								map.get(domain.indexOf(tempD)).add(domain.indexOf(holder));
							}
							ii = index + 2;
						}
					}
				}

			}

			// end of for loop
		}

		for (String p : domain) {
			if (map.containsKey(domain.indexOf(p))) {
				for (int i : map.get(domain.indexOf(p))) {
					System.out.println("Link from " + p + " to " + domain.get(i));
				}
			}
		}

		while (true) {
			String a = reader.readLine();
			if (a.equals("The End")) {
				break;
			}
			String b = reader.readLine();
			/*
			 * System.out.println("DOMAIN: "); for (String s : domain) {
			 * System.out.println(s); } System.out.println();
			 */
			// System.out.println("domain SIZE: " + domain.size());
			visited = new boolean[domain.size()];
			if (!domain.contains(a) || !domain.contains(b)) {
				System.out.println("Can't surf from " + a + " to " + b + ".");
			} else {
				dfs(domain.indexOf(a));
				// System.out.println("index of B: " + domain.indexOf(b));
				if (visited[domain.indexOf(b)]) {
					System.out.println("Can surf from " + a + " to " + b + ".");
				} else {
					System.out.println("Can't surf from " + a + " to " + b + ".");
				}
			}
		}

		// map debug print out
		/*
		 * System.out.println(); System.out.println(); System.out.println(); for (int i
		 * = 0; i < domain.size(); i++) { System.out.println(domain.get(i)); for (String
		 * s : map.get(domain.get(i))) { System.out.print(s + "   "); }
		 * System.out.println(); System.out.println(); }
		 */
	}

	public static void dfs(int cur) {

		visited[cur] = true;

		if (map.containsKey(cur)) {
			for (int i : map.get(cur)) {
				dfs(i);
			}
		}
	}
}