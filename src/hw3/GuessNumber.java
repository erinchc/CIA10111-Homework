package HW3;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		int answer = (int) (Math.random() * 101);
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100猜一個數字");

		int loNum = 0, hiNum = 100;

		while (true) {
			int guess = sc.nextInt();

			if (guess == answer) {
				System.out.println("答對了! 答案就是" + answer);
				break;
			} else if (guess < loNum || guess > hiNum) {
				System.out.println("請輸入範圍內的數字");
			} else if (guess > answer) {
				hiNum = guess;
				System.out.println("太大囉， " + loNum + "~" + hiNum + " 猜一數字");
			} else {
				loNum = guess;
				System.out.println("太小了， " + loNum + "~" + hiNum + " 猜一數字");
			}
		}
		sc.close();
	}
}
