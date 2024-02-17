package HW4;

import java.util.Scanner;

public class Homework4_1 {
	public static void main(String[] args) {

		// 有個一維陣列:{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		// 輸出此陣列所有元素的平均值與大於平均值的元素

		int[] numbers = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;

		// 計算平均值
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		double avg = sum / numbers.length;
		System.out.println("平均值: " + avg);

		// 輸出大於平均值的元素
		System.out.print("大於平均值的元素: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > avg) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();

		// 請建立一個字串,經過程式執行後,輸入結果是反過來的
		// 例如String s = “Hello World”,執行結果即為dlroW olleH

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個字串:");
		String s = sc.nextLine();
		StringBuilder reverse = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse.append(s.charAt(i));
		}
		System.out.println(reverse);

		sc.close();

		// 字串陣列: {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”,“neptune”}
		// 計算出這陣列裡面共有多少個母音(a, e, i, o, u)

		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		String vowel = "aeiou";

		int count = 0;
		for (int i = 0; i < planet.length; i++) {
			String currentString = planet[i];
			for (int j = 0; j < currentString.length(); j++) {
				char currentChar = currentString.charAt(j);

				// 如果不是母音會返回-1
				if (vowel.indexOf(currentChar) != -1) {
					count += 1;
				}
			}
		}
		System.out.println("總共有" + count + "個母音");
	}
}