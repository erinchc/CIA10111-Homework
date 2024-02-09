package HW5;

public class Homework5_2 {

	public static void main(String[] args) {
		randAvg();
	}

	public static void randAvg() {

		System.out.println("本次亂數結果:");

		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			// 隨機產生一個0~100的整數
			int randomNum = (int) (Math.random() * 101);
			System.out.print(randomNum + " ");
			sum += randomNum;
		}

		System.out.println("\n" + sum / 10);
	}

}
