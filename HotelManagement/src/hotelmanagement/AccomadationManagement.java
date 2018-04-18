package hotelmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hotelmanagement.data.RoomDataBase;
import hotelmanagement.model.Bill;
import hotelmanagement.model.Customer;
import hotelmanagement.model.Minibar;
import hotelmanagement.model.Product;
import hotelmanagement.model.Room;
import hotelmanagement.util.DateOperations;

public class AccomadationManagement extends Menu {
	private static List<Customer> customers = new ArrayList();
	private static List<Minibar> miniBar = new ArrayList<>();

	@Override
	public void printMenu() {
		System.out.println("*****************");
		System.out.println("Accomaation Management");
		System.out.println("(1):Check in");
		System.out.println("(2):Check out");
		System.out.println("(3):Guncel musteriler.");
		System.out.println("(4):Minibar listesi");
		System.out.println("(0): Bir onceki menuye don");
	}

	@Override
	public boolean operationMenu(int menu) {
		switch (menu) {
		case 1:
			System.out.println("Checkin'i sectiniz.");
			checkInOperation();
			break;
		case 2:
			System.out.println("check out'u sectiniz.");
			checkOutOperation();

			break;
		case 3:
			System.out.println("Guncel musteri raporu");
			customerReport();
			break;
		case 4:
			System.out.println("Oda minibar durumu.");
			miniBarOperation();
			break;

		case 0:
			System.out.println("onceki menuye donuyorsunuz.");
			return true;
		default:
			System.out.println("gecersiz secim");
			break;
		}
		return false;
	}

	private void customerReport() {
		for (int i = 0; i < customers.size(); i++) {
			// get metodunu kullanmasa direk to stringden customersý yazdirsam olmaz mý.
			System.out.println(customers.get(i));
		}
	}

	private void checkInOperation() {
		Scanner input = new Scanner(System.in);

		RoomDataBase.printEmptyRooms();
		Room selectedRoom = selectRoom(input);

		/*--
		Room selectedRoom=null;
		while(selectedRoom==null) {
			System.out.println("Select room");
			String roomNumber=input.next();
			selectedRoom = RoomDataBase.findRoom(roomNumber);
		}
		 */
		System.out.println("Standard room price:" + selectedRoom.calculatePrice());
		System.out.println("Input price");
		double price = input.nextDouble();

		System.out.println("Ad giriniz.");
		String name = input.next();
		System.out.println("Soyad giriniz");
		String surName = input.next();
		System.out.println("Yas giriniz.");
		int age = input.nextInt();
		System.out.println("Uyruk giriniz.");
		String nationality = input.next();
		System.out.println("check in tarihi");
		String checkInDate = input.next();
		System.out.println("check out tarihi giriniz.");
		String checkOutDate = input.next();
		// Stringi date cevirme.
		int days = DateOperations.calculateDays(checkInDate, checkOutDate);
		Bill bill = new Bill(price, days);

		Customer c1 = new Customer(name, surName, nationality, age, checkInDate, checkOutDate, selectedRoom, bill);
		customers.add(c1);

		selectedRoom.setCustomer(c1);
	}

	private void checkOutOperation() {
		Scanner input = new Scanner(System.in);
		Room selectedRoom = selectRoom(input);

		Customer customer = selectedRoom.getCustomer();
		System.out.println(customer);

		double extra = 0;
		extra = selectedRoom.getMinibar().calculate() + selectedRoom.getLobbyBeverage().calculate();
		customer.getBill().setExtra(extra);
		System.out.println("Total bill:" + customer.getBill().getTotal());

		selectedRoom.checkOutReset();
		customers.remove(customer);

	}

	private void miniBarOperation() {
		Scanner input = new Scanner(System.in);
		Room r = selectRoom(input);
		System.out.println(r.getMinibar());
		System.out.println("Please write the product.");
		String productType = input.next();
		Product p = r.getMinibar().findProduct(productType);
		p.setQuantity(p.getQuantity() - 1);

	}

}
