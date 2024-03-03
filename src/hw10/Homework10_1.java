package hw10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework10_1 {

	/*
	 * 請設計一隻程式,用亂數產生5個介於1~100之間的整數,而輸出結果可以判斷出這5個整數為是否為質數 (提示:Math類別)
	 */

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		while (set.size() < 5) {
			set.add((int) (Math.random() * 100 + 1));
		}

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer num = it.next();
			if (num == 1) {
				System.out.println("1不是質數");
				continue;
			}
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if ((num % i == 0)) {
					System.out.println(num + "不是質數");
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num + "是質數");
			}
		}
	}
}
