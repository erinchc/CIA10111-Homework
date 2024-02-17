package HW7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Homework7_5 {

	// 承上題,請寫一個程式,能讀取Object.ser這四個物件
	// 並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {
				Object obj = ois.readObject();

				if (obj instanceof Cat) {
					((Cat) obj).speak();
				} else if (obj instanceof Dog) {
					((Dog) obj).speak();
				}
			}

		// 讀到檔案結尾 catch EOFException 結束讀取
		} catch (EOFException ee) {
			System.out.println("Done!");
		}

		ois.close();
		fis.close();
	}
}
