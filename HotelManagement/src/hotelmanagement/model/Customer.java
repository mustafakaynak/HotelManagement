package hotelmanagement.model;

public class Customer {
	private String name;
	private String surName;
	private String nationality;
	private int age;
	private String checkInDate;
	private String checkOutDate;

	public Customer(String name, String surName, String nationality, int age, String checkInDate, String checkOutDate) {
		super();
		this.name = name;
		this.surName = surName;
		this.nationality = nationality;
		this.age = age;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}

	public String getName() {
		return name;
	}

	public String getSurName() {
		return surName;
	}

	public String getNationality() {
		return nationality;
	}

	public int getAge() {
		return age;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	@Override
	public String toString() {

		return name + " \n" + surName + " \n" + nationality + " \n" + checkInDate + " \n" + checkOutDate;
	}

}
