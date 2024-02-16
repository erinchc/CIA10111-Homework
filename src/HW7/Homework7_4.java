package HW7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Homework7_4 {

	// 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。
	// 注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

	public static void main(String[] args) {

		// 建立Object陣列來存放Cat和Dog物件
		Object[] obj = new Object[4];
		obj[0] = new Cat("Kattie");
		obj[1] = new Cat("Kitty");
		obj[2] = new Dog("Doggie");
		obj[3] = new Dog("Debby");

		// 檢查C:\data資料夾是否存在，如果不存在要新增一個資料夾
		File directory = new File("C:\\data");
		if (!directory.exists()) {
			directory.mkdir();
		}

		try {
			File file = new File("C:\\data\\Object.ser");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (int i = 0; i < obj.length; i++) {
				oos.writeObject(obj[i]);
			}

			oos.close();
			fos.close();

		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
