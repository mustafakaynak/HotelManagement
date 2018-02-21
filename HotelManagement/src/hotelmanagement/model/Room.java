package hotelmanagement.model;

import java.util.Date;

public class Room {
	int roomNumber;
	private Date lastCleanDate;
	private RoomType type;
	private Minibar minibar;

	public Room(int roomNumber, RoomType type) {

		this.roomNumber = roomNumber;
		this.type = type;
		this.minibar = new Minibar();
	}

	public Minibar getMinibar() {
		return minibar;
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

}
