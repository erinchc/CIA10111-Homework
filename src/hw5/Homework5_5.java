package hw5;

public class Homework5_5 {
	
	// 設計一個方法genAuthCode(),當呼叫此方法時會回傳一個8位數的驗證碼,內容包含英文大小寫與數字的亂數組合

	public static void main(String[] args) {
		genAuthCode();
	}

	public static void genAuthCode() {

		System.out.println("本次隨機產生驗證碼為:");

		int count = 1;
		while (count < 9) {

			// 隨機產生一個介於48~122的整數
			int randomNum = (int) (Math.random() * 75) + 48;

			// ASCII碼48~57為數字0~9，ASCII碼65~90為A~Z，ASCII碼97~122為a~z
			if ((randomNum <= 57) || (randomNum >= 65 && randomNum <= 90) || (randomNum >= 97)) {
				System.out.print((char) randomNum);
				count++;
			}
		}
	}
}
