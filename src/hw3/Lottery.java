package HW3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Lottery {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...輸入你討厭的數字:");
		int n = sc.nextInt();
		String dislikedNum = String.valueOf(n);

		// 建立一個ArrayList validNumbers 儲存不包含討厭數字的有效選號
		ArrayList<Integer> validNumbers = new ArrayList<Integer>();
		int count = 0;
		for (int i = 1; i < 50; i++) {
			String s = String.valueOf(i);
			if (!(s.contains(dislikedNum))) {
				System.out.print(i + "\t");
				validNumbers.add(i);
				count++;
				if (count % 7 == 0) {
					System.out.println();
				}
			}
		}
		System.out.print("總共有" + count + "個數字可選\n");
		sc.close();

		// 將validNumbers中的數字順序打亂
		Collections.shuffle(validNumbers);

		// print出前六個選號
		System.out.println("自動選號:");
		for (int x = 0; x <= 5; x++) {
			System.out.print(validNumbers.get(x) + "\t");
		}

	}
}
