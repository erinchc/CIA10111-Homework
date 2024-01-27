package HW3;

import java.util.Scanner;
import java.util.Arrays;

public class Triangle {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入三個整數: ");

        int[] tri = new int[3];
        for (int i = 0; i < 3; i++) {
            tri[i] = sc.nextInt();
        }

        triangleType(tri);
        sc.close();

    }

    public static void triangleType(int[] side) {
        // 三角形邊長依大小順序排列
        Arrays.sort(side);

        int a = side[0];
        int b = side[1];
        int c = side[2];

        if (a <= 0 || a + b <= c) {
            System.out.println("不是三角形");
        } else if (a == b && b == c) {
            System.out.println("正三角形");
        } else if (a == b || b == c || a == c) {
            System.out.println("等腰三角形");
        } else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            System.out.println("直角三角形");
        } else {
            System.out.println("其他三角形");
        }
    }

}
