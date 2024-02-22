package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework8_1 {

    /*
        • 請建立一個Collection物件並將以下資料加入:
        Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
        Object物件、“Snoopy”、BigInteger(“1000”)

        • 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
        • 移除不是java.lang.Number相關的物件
        • 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
     */

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add(100);
        list.add(3.14);
        list.add(21L);
        list.add((short) 100);
        list.add(5.1);
        list.add("Kitty");
        list.add(100);
        list.add(new Object());
        list.add("Snoopy");
        list.add(new BigInteger("1000"));

        // 印出所有元素
        System.out.println("======== Iterator ========");
        Iterator<Object> objs = list.iterator();
        while (objs.hasNext()) {
            System.out.print(objs.next() + " ");
        }
        System.out.println();

        System.out.println("======== for loop ========");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("======== for-each ========");
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 移除不是java.lang.Number相關的物件
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (!(obj instanceof Number)) {
                it.remove();
            }
        }

        // 印出已移除非Number相關的物件集合中的所有元素
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
    }

}