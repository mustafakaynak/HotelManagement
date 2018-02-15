package hotelmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hotelmanagement.model.Customer;

public class AccomadationManagement extends Menu {
	private static List<Customer> customers = new ArrayList<Customer>();

	@Override
	public void printMenu() {
		System.out.println("***********************************");
		System.out.println(" Accomadation Menu:");
		System.out.println("(1) check in");
		System.out.println("(2) chech out.");
		System.out.println("(3) early check out");
		System.out.println("(4) Guncel musteriler.");
		System.out.println("(0) Bir onceki menuye don.");
		System.out.println("0 ile 3 arasinda giris yapiniz.");
		System.out.println("***********************************");

	}

	@Override
	public boolean operationMenu(int menu) {
		// boolean neden false donduruyor.
		switch (menu) {
		case 1:
			System.out.println("check in'i sectiniz.");
			checkInOperation();
			return false;

		case 2:
			System.out.println("check outu sectiniz.");
			return false;

		case 3:
			System.out.println("early check outu sectiniz.");
			return false;
		case 4:
			System.out.println("guncel musteri raporu.");

			customerReport();

			return false;

		case 0:
			System.out.println("onceki menuye donuyorsunuz.");
			return true;
		default:
			System.out.println("Gecersiz secim.");
			return false;
		}

	}

	private void customerReport() {
		if (!customers.isEmpty()) {
			for (int i = 0; i < customers.size(); i++) {
				System.out.println(customers.get(i));
			}
		} else {
			System.out.println("suan hicbir musteri bulunmamaktadir.");
		}

	}

	private void checkInOperation() {

		Scanner input = new Scanner(System.in);

		// TODO sys out ile her birini sor
		// TODO Hata kontrolu
		System.out.println("Ad giriniz.");
		String name = input.next();
		System.out.println("soyad giriniz.");
		String surName = input.next();
		System.out.println("yas giriniz");
		int age = input.nextInt();
		System.out.println("uyruk giriniz.");
		String nationality = input.next();
		System.out.println("checkin tarihi");
		String checkInDate = input.next();
		System.out.println("check out tarihi.");
		String checkOutDate = input.next();

		Customer c1 = new Customer(name, surName, nationality, age, checkInDate, checkOutDate);
		customers.add(c1);

	}

}
