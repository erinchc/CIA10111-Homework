package hw1;

public class Homework1 {
	public static void main(String[] args) {
		// 計算12和6的和與積

		int num1 = 12, num2 = 6;
		System.out.println("12, 6的和= " + (num1 + num2));
		System.out.println("12, 6的積= " + (num1 * num2));
		System.out.println("------------------------");

		// 計算200顆蛋共是幾打幾顆?

		int totalEgg = 200, perDozen = 12;
		System.out.println("200顆蛋 = " + totalEgg / perDozen + "打" + totalEgg % perDozen + "顆");
		System.out.println("------------------------");

		// 計算256559秒為多少天、多少小時、多少分與多少秒

		int totalSeconds = 256559;
		int days = totalSeconds / 86400;
		int hours = (totalSeconds % 86400) / 3600;
		int minutes = ((totalSeconds % 86400) % 3600) / 60;
		int seconds = ((totalSeconds % 86400) % 3600) % 60;
		System.out.println(days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");
		System.out.println("------------------------");

		// 定義一個常數為3.1415(圓周率),計算半徑為5的圓面積與圓周長

		final double PI = 3.1415;
		int radius = 5;
		double area = Math.pow(radius, 2) * PI;
		double perimeter = 2 * radius * PI;
		System.out.printf("圓面積: %.2f%n", area);
		System.out.printf("圓周長:  %.2f%n", perimeter);
		System.out.println("------------------------");

		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢

		int principal = 1500000, years = 10;
		double rate = 0.02;
		double amount = principal * Math.pow((1 + rate), years);
		System.out.printf("10年後的總金額: %.2f%n", amount);
		System.out.println("------------------------");

		// 利用System.out.println()印出以下三個運算式結果，用註解各別說明答案的產生原因
		// 5 + 5
		// 5 + '5'
		// 5 + "5"

		System.out.println(5 + 5); // 兩個整數相加，結果為10。
		System.out.println(5 + '5'); // '5'是字元char，會被轉換成unicode 53，結果為5+53=58。
		System.out.println(5 + "5"); // 數字和字串相加時兩者會串接，所以結果是字串 "55"。
	}
}
