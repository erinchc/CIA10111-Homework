package HW7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework7_3 {
	
	// 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。
    // 呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案

    public static void copyFile(File input, File output) throws IOException {

        FileReader in = new FileReader(input);
        FileWriter out = new FileWriter(output);

        int i;
        while ((i = in.read()) != -1) {
            out.write(i);
            System.out.print((char) i);
            System.out.flush();
        }

        in.close();
        out.close();
    }

    public static void main(String[] args) {

        try {
            File input = new File("C:\\course\\src\\Hello.txt");
            File output = new File("C:\\course\\src\\Hello2.txt");
            copyFile(input, output);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
