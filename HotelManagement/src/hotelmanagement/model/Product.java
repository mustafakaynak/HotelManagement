package hotelmanagement.model;

public class Product {
	private String type;
	private int quantity;

	private Product(String type, int quantity) {
		this.type = type;
		this.quantity = quantity;
	}

	public static Product createCola(int q) {
		// Burayi anlamadim neden createOther yaptik.
		Product o = createOther("cola", q);
		return o;
	}

	public static Product createOther(String t, int q) {
		return new Product(t, q);
	}

	public String getType() {
		return type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
