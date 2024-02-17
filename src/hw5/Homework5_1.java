package HW5;

import java.util.Scanner;

public class Homework5_1 {

	// 設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {

				System.out.println("請輸入寬與高:");
				int width = sc.nextInt();
				int height = sc.nextInt();
				starSquare(width, height);
				break;

			} catch (IllegalArgumentException ie) {
				System.out.println(ie.getMessage());
			} catch (Exception e) {
				System.out.println("輸入格式錯誤，需為整數");
				sc.nextLine();
			}
		}
		sc.close();
	}

	public static void starSquare(int width, int height) {

		// 檢查輸入的寬高是否都大於0
		if (width <= 0 || height <= 0) {
			throw new IllegalArgumentException("寬與高必須大於0");
		}

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
