package hw8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework8_2 {

	public static void main(String[] args) {

		// 印出不重複的Train物件

		Set<Train> set = new HashSet<>();
		set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set.add(new Train(118, "自強", "高雄", "台北", 500));
		set.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set.add(new Train(122, "自強", "台中", "花蓮", 600));
		set.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));

		// 取出元素: Iterator
		Iterator<Train> it = set.iterator();
		while (it.hasNext()) {
			Train train = it.next();
			System.out.println(train);
		}
		System.out.println();

		// 取出元素: for-each
		for (Train train : set) {
			System.out.println(train);
		}
		System.out.println();

	}

}
