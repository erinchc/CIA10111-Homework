package HW6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {

				System.out.println("請輸入x的值:");
				int x = sc.nextInt();

				System.out.println("請輸入y的值:");
				int y = sc.nextInt();

				int result = c.powerXY(x, y);
				System.out.println(x + "的" + y + "次方等於" + result);

				break;

			} catch (CalException ce) {
				System.out.println(ce.getMessage());
			} catch (Exception e) {
				System.out.println("輸入格式不正確");

				// 跳過目前這一行的內容，由下一行開始讀取
				// 避免下一個迴圈開始後又重複讀取不正確的值，而形成無窮迴圈
				sc.nextLine();
			}
		}

		sc.close();

	}
}
