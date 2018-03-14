package hotelmanagement.model;

import java.util.ArrayList;
import java.util.List;

public class Minibar {
	List<Product> productList;

	public Minibar() {
		productList = new ArrayList<>();
		Product product1 = Product.createCola(1);
		productList.add(product1);
		Product product2 = Product.createOther("Sprite", 1);
		productList.add(product2);
		Product product3 = Product.createOther("Fanta", 1);
		productList.add(product3);
		Product product4 = Product.createOther("Enerji", 1);
		productList.add(product4);
		Product product5 = Product.createOther("Su", 2);
		productList.add(product5);
		Product product6 = Product.createOther("Soda", 2);
		productList.add(product6);
		Product product7 = Product.createOther("Kaju", 1);
		productList.add(product7);
		Product product8 = Product.createOther("Lokum", 1);
		productList.add(product8);
		Product product9 = Product.createOther("Karisik", 1);
		productList.add(product9);

	}

	@Override
	public String toString() {
		/*--
		String tmp = "";//cola:1 sprite:1
		for (int i = 0; i < productList.size(); i++) {
			tmp = tmp + productList.get(i).getType() + ":" + productList.get(i).getQuantity() + " ";
		}
		return tmp;
		*/

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < productList.size(); i++) {
			sb.append(productList.get(i).getType() + ":" + productList.get(i).getQuantity() + " ");
		}
		return sb.toString();

	}

	public Product findProduct(String type) {
		for (int i = 0; i < productList.size(); i++) {
			Product product = productList.get(i);
			if (type.equals(product.getType())) {
				return product;
			}
		}
		return null;

	}

}
