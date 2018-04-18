package hotelmanagement.model;

import java.util.ArrayList;

public class LobbyBeverage extends Minibar {

	public LobbyBeverage() {
		productList = new ArrayList<Product>();

		Product product1 = Product.createCola(0);
		productList.add(product1);
		Product product2 = Product.createOther("Sprite", 0, 10.0);
		productList.add(product2);
		Product product3 = Product.createOther("Fanta", 0, 10.0);
		productList.add(product3);
		Product product4 = Product.createOther("Enerji", 0, 12);
		productList.add(product4);
		Product product5 = Product.createOther("Su", 0, 5);
		productList.add(product5);
		Product product6 = Product.createOther("Soda", 0, 5);
		productList.add(product6);
		Product product7 = Product.createOther("Kaju", 0, 10);
		productList.add(product7);
		Product product8 = Product.createOther("Lokum", 0, 10);
		productList.add(product8);
		Product product9 = Product.createOther("Karisik", 0, 10);
		productList.add(product9);
		Product product10 = Product.createOther("Coffe", 0, 10.0);
		productList.add(product10);
		Product product11 = Product.createOther("Turkish coffe", 0, 10.0);
		productList.add(product11);
		Product product12 = Product.createOther("Tea", 0, 5.0);
		productList.add(product12);

	}

	public Product add(int quantity, String type) {
		Product p = findProduct(type);
		if (p == null) {
			// listede olmayan urun siparisi
			return null;
		} else {
			int newQuantity = quantity + p.getQuantity();
			p.setQuantity(newQuantity);
		}
		return p;
	}

	@Override
	public double calculate() {
		double total = 0;
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getQuantity() != 0) {
				total += productList.get(i).getPrice() * productList.get(i).getQuantity();
			}
		}
		return total;
	}
}
