package hotelmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hotelmanagement.data.RoomDataBase;
import hotelmanagement.model.Customer;
import hotelmanagement.model.Room;

public class AccomadationManagement extends Menu {
	private static List<Customer> customers = new ArrayList();

	@Override
	public void printMenu() {
		System.out.println("*****************");
		System.out.println("Accomaation Management");
		System.out.println("(1):Check in");
		System.out.println("(2):Check out");
		System.out.println("(3):Early check out");
		System.out.println("(4):Guncel musteriler.");
		System.out.println("(5)Minibar listesi");
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
			System.out.println("early check out'u sectiniz.");
			earlyCheckOutOperation();
			break;
		case 4:
			System.out.println("Guncel musteri raporu");
			customerReport();
			break;
		case 5:
			System.out.println("Minibar listesini sectiniz.");

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
		Room selectedRoom = null;
		while (true) {
			System.out.println("Select room");
			String roomNumber = input.next();
			selectedRoom = RoomDataBase.findRoom(roomNumber);
			if (selectedRoom != null) {
				break;
			}
		}

		/*--
		Room selectedRoom=null;
		while(selectedRoom==null) {
			System.out.println("Select room");
			String roomNumber=input.next();
			selectedRoom = RoomDataBase.findRoom(roomNumber);
		}
		 */

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
		Customer c1 = new Customer(name, surName, nationality, age, checkInDate, checkOutDate, selectedRoom);
		customers.add(c1);

		selectedRoom.setCustomer(c1);
	}

	private void checkOutOperation() {
		Scanner input = new Scanner(System.in);
		System.out.println(customers);
		System.out.println("Lutfen check out etmek istediðiniz musterinin sayisini giriniz.");
		int sayi = input.nextInt();
		// for (int i = 0; i < customers.size(); i++) {
		// if (sayi == i) {
		customers.remove(sayi - 1);
		// }
		// }
		System.out.println("Guncel musteri raporu.");
		System.out.println(customers);

	}

	private void earlyCheckOutOperation() {
		Scanner input = new Scanner(System.in);
		System.out.println(customers);
		System.out.println("Lutfen check out etmek istediðiniz musterinin sayisini giriniz.");
		int sayi = input.nextInt();
		customers.remove(sayi - 1);
		System.out.println("Guncel musteri raporu.");
		System.out.println(customers);
	}

}
