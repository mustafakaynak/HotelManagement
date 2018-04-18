package hotelmanagement.model;

public class Product {

	private String type;
	private int quantity;
	private double price;

	private Product(String type, int quantity, double price) {
		this.type = type;
		this.quantity = quantity;
		this.price = price;
	}

	public static Product createCola(int q) {
		Product o = createOther("cola", q, 10.0);
		return o;
	}

	public static Product createOther(String t, int q, double p) {
		return new Product(t, q, p);
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
