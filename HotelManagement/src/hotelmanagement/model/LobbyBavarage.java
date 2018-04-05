package hotelmanagement.model;

import java.util.ArrayList;

public class LobbyBavarage extends Minibar {

	public LobbyBavarage() {
		productList = new ArrayList<Product>();
	}

	public Product add(int quantity, String type) {
		Product p = findProduct(type);
		if (p == null) {
			p = Product.createOther(type, quantity, 1);
			productList.add(p);

		} else {
			int newQuantity = quantity + p.getQuantity();
			p.setQuantity(newQuantity);
		}
		return p;
	}
}
