package stringtest;

import java.util.StringTokenizer;

public class StringCalculator {
	StringTokenizer st;

	public int add(String numbers) {
		int sum = 0;
		if (numbers.length() > 0) {
			st = new StringTokenizer(numbers, ",");
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			return sum;
		}
		return sum;
	}
}
