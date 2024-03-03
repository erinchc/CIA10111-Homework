package hw10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Homework10_2 {

	/*
	 * 設計一隻程式，讓使用者輸入一個任意數後，選擇要以下列何種表示方法顯示 (1)千分位 (2)百分比 (3)科學記號，
	 * 而輸入非任意數會顯示提示訊息 (提示: TestFormatter.java, Java API 文件, 判斷數字可用正規表示法)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字: ");
		// 比對整數或小數
		String regex = "^\\d+(\\.\\d+)?$";
		Double value;
		while (true) {
			String input = sc.nextLine();
			if (input.matches(regex)) {
				value = Double.parseDouble(input);
				break;
			} else {
				System.out.println("數字格式不正確，請再輸入一次:");
			}
		}

		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號: ");
		while (true) {
			// 檢查非整數輸入
			if (sc.hasNextInt()) {
				int format = sc.nextInt();
				switch (format) {
				// 千分位
				case 1:
					Format dfm1 = new DecimalFormat("#,###.##");
					System.out.println(dfm1.format(value));
					break;
				// 百分比
				case 2:
					Format dfm2 = new DecimalFormat("#.##%");
					System.out.println(dfm2.format(value));
					break;
				// 科學記號
				case 3:
					Format dfm3 = new DecimalFormat("0.##E00");
					System.out.println(dfm3.format(value));
					break;
				default:
					System.out.println("無效的選擇，請重新輸入: ");
					continue;
				}
				// 輸入有效選擇後，退出while迴圈
				break;
			} else {
				System.out.println("無效的選擇，請重新輸入: ");
				sc.next();
			}
		}
		sc.close();
	}
}
