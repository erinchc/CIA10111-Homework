package HW4;

import java.util.Scanner;

public class Homework4_3 {
	public static void main(String[] args) {

		// 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
		// 例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

		System.out.println("請輸入西元年 月 日, 三個整數:");
		Scanner sc = new Scanner(System.in);

		int[] enterDate = new int[3];
		for (int i = 0; i < 3; i++) {
			enterDate[i] = sc.nextInt();
		}

		sc.close();

		int year = enterDate[0];
		int month = enterDate[1];
		int day = enterDate[2];

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 閏年
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			daysInMonth[1] = 29;
		}
		// 檢查月份
		if ((month < 1) || (month > 12)) {
			System.out.println("月份輸入不正確，應在1~12之間");
			return;
		}
		// 檢查日期
		if ((day < 1) || (day > daysInMonth[month - 1])) {
			System.out.println("日期輸入不正確，應在當月的天數範圍內");
			return;
		}

		int sum = 0;
		for (int i = 0; i < month - 1; i++) {
			sum += daysInMonth[i];
		}
		sum += day;

		System.out.println("輸入的日期為該年的第" + sum + "天");

	}
}
