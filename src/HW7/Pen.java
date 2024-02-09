package HW7;

public abstract class Pen {
	
	private String brand;
	private double price;

	public Pen() {
	}

	public Pen(String brand, double price) {
		this.brand = brand;
		setPrice(price);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {

		if (price <= 0) {
			throw new IllegalArgumentException("請確認價格");
		} else {
			this.price = price;
		}
	}

	public abstract void write();
}
