package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {

	/*
	 * 請設計一個Train類別,並包含以下屬性: - 班次 number,型別為int - 車種 type,型別為String - 出發地
	 * start,型別為String - 目的地 dest,型別為String - 票價 price,型別為double
	 */

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public void setNumber(int number) {

		this.number = number;
	}

	public int getNumber() {

		return number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {

		this.type = type;
	}

	public String getStart() {

		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Train train = (Train) o;
		return number == train.number && Double.compare(price, train.price) == 0 && Objects.equals(type, train.type)
				&& Objects.equals(start, train.start) && Objects.equals(dest, train.dest);
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, type, start, dest, price);
	}

	public int compareTo(Train atrain) {
		if (this.number > atrain.number) {
			return -1;
		} else if (this.number == atrain.number) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "number=" + number + ", type='" + type + '\'' + ", start='" + start + '\'' + ", dest='" + dest + '\''
				+ ", price=" + price;
	}
}
