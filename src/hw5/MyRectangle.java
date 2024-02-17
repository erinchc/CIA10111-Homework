package HW5;

public class MyRectangle {

	private double width;
	private double depth;

	// 不帶參數也無內容的建構子
	public MyRectangle() {
	}

	// 有參數的建構子，傳入的兩個引數會指定給對應的屬性
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}

	double getArea() {
		return width * depth;
	}

}
