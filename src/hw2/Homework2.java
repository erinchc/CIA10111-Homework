package hw2;

public class Homework2 {
	public static void main(String[] args) {
		// 計算1~1000的偶數和 (2+4+6+8+...+1000)

		int sum = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println("1~1000的偶數和: " + sum);
		System.out.println("------------------------");

		// 計算1~10的連乘積 (1*2*3*...*10) (for迴圈)

		int result = 1;
		for (int i = 1; i <= 10; i++) {
			result = result * i;
		}
		System.out.println("1~10的連乘積(for迴圈): " + result);
		System.out.println("------------------------");

		// 計算1~10的連乘積 (1*2*3*...*10) (while迴圈)

		int a = 1, product = 1;
		while (a <= 10) {
			product = product * a;
			a++;
		}
		System.out.println("1~10的連乘積(while迴圈): " + product);
		System.out.println("------------------------");

		// 輸出結果為:1 4 9 16 25 36 49 64 81 100

		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i);
			// 在數字後面加一個空格
			if (i < 10) {
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.println("------------------------");

		// 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

		int x = 1;
		int count = 0;
		while (x < 50) {
			String s = String.valueOf(x);
			if (!(s.contains("4"))) {
				System.out.print(s + " ");
				count++;
			}
			x++;
		}

		System.out.println("\n總共有: " + count + "個");
		System.out.println("------------------------");

		// 輸出結果為以下:
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		for (int num1 = 10; num1 > 0; num1--) {
			for (int num2 = 1; num2 <= num1; num2++) {
				System.out.print(num2 + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------");

		// 輸出結果為以下:
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF

		// Method 1
		// 外層決定要print哪個字母
		for (char c = 'A'; c <= 'F'; c++) {
			// 內層決定要print幾次
			for (int b = 1; b <= (c - 'A' + 1); b++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		// Method 2
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				// A的ASCII碼=65
				System.out.print((char)(65 + i));
			}
			System.out.println();
		}
		
	}

}
