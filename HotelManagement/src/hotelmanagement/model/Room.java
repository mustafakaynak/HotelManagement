package hotelmanagement.model;

import java.util.Date;

public class Room {
	public static double PRICE_CONSTANT = 100;
	int roomNumber;
	private Date lastCleanDate;
	private RoomType type;
	private Minibar minibar;
	private LobbyBavarage lobbyBavarage;
	private Customer customer;

	public Room(int roomNumber, RoomType type) {

		this.roomNumber = roomNumber;
		this.type = type;
		this.minibar = new Minibar();
		this.customer = null;
		this.lobbyBavarage = new LobbyBavarage();
	}

	public LobbyBavarage getLobbyBavarage() {
		return lobbyBavarage;
	}

	public Minibar getMinibar() {
		return minibar;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setMinibar(Minibar minibar) {
		this.minibar = minibar;
	}

	public void setLastCleanDate(Date lastCleanDate) {
		this.lastCleanDate = lastCleanDate;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public Date getLastCleanDate() {
		return lastCleanDate;
	}

	public RoomType getType() {
		return type;
	}

	public boolean isClean() {
		Date today12AM = new Date();
		today12AM.setHours(0);
		today12AM.setMinutes(0);
		today12AM.setSeconds(0);
		if (lastCleanDate == null || lastCleanDate.before(today12AM)) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {

		return "NO:" + roomNumber + "\n" + "TYPE:" + type;
	}

	public enum RoomType {
		TWIN_STANDARD, FRENCH_STANDARD, FRENCH_CLUB, TWIN_CLUB
	}

	public boolean isEmpty() {
		if (customer == null) {
			return true;
		} else {
			return false;
		}

	}

	public double calculatePrice() {
		double price = 0;
		switch (type) {
		case TWIN_STANDARD:
		case FRENCH_STANDARD:
			price = PRICE_CONSTANT * 2;
			break;
		case FRENCH_CLUB:
		case TWIN_CLUB:
			price = PRICE_CONSTANT * 2.5;
			break;
		default:
			System.out.println("Undefined");
			break;
		}
		return price;
	}

}
