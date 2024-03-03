package hw10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Homework10_3 {

	/*
	 * 請設計一隻程式,讓使用者輸入日期(年月日,例如:20110131)後,可以轉成想要的輸出格式化成 (1)年/月/日 (2)月/日/年
	 * (3)日/月/年三選一,而輸入非指定日期數字格式會顯示出提示訊息 如圖 (提示:TestFormatter.java, Java
	 * API文件,判斷格式可用正規表示法)
	 */
	public static void main(String[] args) {

		System.out.println("請輸入日期(年月日，例如:20110131): ");
		Scanner sc = new Scanner(System.in);
		String regex = "^\\d{4}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$";
		String input;
		LocalDate date = null;
		while (date == null) {
			input = sc.nextLine();
			
			// 正規表示法檢查日期格式
			if (!input.matches(regex)) {
				System.out.println("日期格式不正確，請再輸入一次: ");
				continue;
			}
			
			// 檢查無效日期，如 20240230 或 20240931
			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuuMMdd")
						.withResolverStyle(ResolverStyle.STRICT);
				date = LocalDate.parse(input, formatter);
			} catch (DateTimeParseException de) {
				System.out.println("輸入日期無效，請再輸入一次: ");
			}
		}
		

		System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年: ");
		DateTimeFormatter formatter;
		while (true) {
			int format = sc.nextInt();
			switch (format) {
			case 1:
				formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				break;
			case 2:
				formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				break;
			case 3:
				formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				break;
			default:
				System.out.println("選擇無效，請重新輸入: ");
				continue;
			}
			break;
		}

		System.out.println(date.format(formatter));
		sc.close();
	}

}
