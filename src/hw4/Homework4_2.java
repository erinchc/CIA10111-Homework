package HW4;

import java.util.Scanner;

public class Homework4_2 {
	public static void main(String[] args) {

		// 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
		// 員工編號 25 32 8 19 27
		// 身上現金 2500 800 500 1000 1200
		// 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
		// 並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入想借的金額:");
		int money = sc.nextInt();

		int[][] intArray = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		int count = 0;
		// 以存放有錢可借的員工編號列表
		StringBuilder lenders = new StringBuilder();

		for (int i = 0; i < intArray[1].length; i++) {
			if (money <= intArray[1][i]) {
				count += 1;
				lenders.append(intArray[0][i]).append(" ");
			}
		}

		if (count > 0) {
			System.out.println("有錢可借的員工編號: " + lenders);
			System.out.println("共 " + count + " 人");
		} else {
			System.out.println("沒人有足夠的錢");
		}

		sc.close();
	}
}
