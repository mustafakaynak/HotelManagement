package hotelmanagement.model;

import java.util.ArrayList;
import java.util.List;

public class Minibar {
	protected List<Product> productList;
	private double currentBill;
	private static final List<Product> INITIAL_MINIBAR_PRODUCTS = new ArrayList<Product>();
	static {
		createMinibarProducts(INITIAL_MINIBAR_PRODUCTS);
	}

	public Minibar() {
		List<Product> productList = new ArrayList<>();
		createMinibarProducts(productList);
	}

	public static void createMinibarProducts(List<Product> productList) {
		Product product1 = Product.createCola(1);
		productList.add(product1);
		Product product2 = Product.createOther("Sprite", 1, 10.0);
		productList.add(product2);
		Product product3 = Product.createOther("Fanta", 1, 10.0);
		productList.add(product3);
		Product product4 = Product.createOther("Enerji", 1, 12);
		productList.add(product4);
		Product product5 = Product.createOther("Su", 2, 5);
		productList.add(product5);
		Product product6 = Product.createOther("Soda", 2, 5);
		productList.add(product6);
		Product product7 = Product.createOther("Kaju", 1, 10);
		productList.add(product7);
		Product product8 = Product.createOther("Lokum", 1, 10);
		productList.add(product8);
		Product product9 = Product.createOther("Karisik", 1, 10);
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

	public double calculate() {
		return currentBill;
	}

	public void refill() {
		for (int i = 0; i < INITIAL_MINIBAR_PRODUCTS.size(); i++) {
			if (productList.get(i).getQuantity() != INITIAL_MINIBAR_PRODUCTS.get(i).getQuantity()) {
				int diff = INITIAL_MINIBAR_PRODUCTS.get(i).getQuantity() - productList.get(i).getQuantity();
				currentBill += diff * productList.get(i).getPrice();
			}
		}

		productList.clear();
		createMinibarProducts(productList);

	}

	public void refill2() {
		for (int i = 0; i < INITIAL_MINIBAR_PRODUCTS.size(); i++) {

			Product product_i = INITIAL_MINIBAR_PRODUCTS.get(i);

			for (int j = 0; j < productList.size(); j++) {

				Product product_j = productList.get(j);

				if (product_j.getType().equals(product_i.getType())) { // eslesen bulundu

					if (product_j.getQuantity() != product_i.getQuantity()) {
						int diff = product_i.getQuantity() - product_j.getQuantity();
						currentBill += diff * product_j.getPrice();
					}

					break;
				}
			}

		}

		productList.clear();
		createMinibarProducts(productList);

	}

}
