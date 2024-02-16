package HW7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Homework7_2 {

	// 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡
	// (請使用append功能讓每次執行結果都能被保存起來)

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("C:\\course\\src\\Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);

			for (int i = 1; i <= 10; i++) {
				int randomNum = (int) ((Math.random() * 1000) + 1);
				ps.print(randomNum + " ");
			}
			ps.println();

			ps.close();
			bos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
