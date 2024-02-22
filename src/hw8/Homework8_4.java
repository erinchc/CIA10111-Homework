package hw8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework8_4 {

	public static void main(String[] args) {

		// 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件

		Set<Train> treeset = new TreeSet<>();
		treeset.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		treeset.add(new Train(1254, "區間", "屏東", "基隆", 700));
		treeset.add(new Train(118, "自強", "高雄", "台北", 500));
		treeset.add(new Train(1288, "區間", "新竹", "基隆", 400));
		treeset.add(new Train(122, "自強", "台中", "花蓮", 600));
		treeset.add(new Train(1222, "區間", "樹林", "七堵", 300));
		treeset.add(new Train(1254, "區間", "屏東", "基隆", 700));

		// for-each
		for (Train train : treeset) {
			System.out.println(train);
		}
		System.out.println();

		// Iterator
		Iterator<Train> it = treeset.iterator();
		while (it.hasNext()) {
			Train train = it.next();
			System.out.println(train);
		}

	}
}
