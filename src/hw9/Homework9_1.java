package hw9;

public class Homework9_1 extends Thread {
	
	/*
	 * 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
	 * 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
	 * Sleep時間由亂數產生500~3000之間的毫秒數，需留意主執行緒執行順序。
	 */
	
	public int count = 1;
	public String contestant;

	Homework9_1(String contestant) {
		this.contestant = contestant;
	}
	
	// override run()方法
	public void run() {
		while (count <= 10) {
			System.out.println(contestant + "吃第" + count + "碗飯");
			if (count == 10) {
				System.out.println(contestant + "吃完了!");
			}
			count++;

			try {
				// 亂數產生500~3000毫秒
				long millis = (long) (Math.random() * 2501 + 500);
				Thread.sleep(millis);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	

	public static void main(String[] args) {

		System.out.println("----- 大胃王快食比賽開始! -----");

		Homework9_1 c1 = new Homework9_1("饅頭人");
		Homework9_1 c2 = new Homework9_1("詹姆士");

		c1.start();
		c2.start();

		try {
			c1.join();
			c2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("----- 大胃王快食比賽結束! -----");
	}
}
