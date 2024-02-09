package HW7;

public class PenPoly {

	public static void main(String[] args) {

		try {
			Pen[] p = new Pen[2];
			p[0] = new Pencil("LYRA", 1.99);
			p[1] = new InkBrush("Pentel", 5.6);

			for (int i = 0; i < p.length; i++) {
				p[i].write();
				System.out.println("售價: " + p[i].getPrice());
			}
		} catch (IllegalArgumentException ie) {
			System.out.println(ie.getMessage());
		}

	}

}
