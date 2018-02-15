package hotelmanagement.model;

import java.util.Date;

public class Room {
	private int roomNumber;
	private RoomType type;
	private Date lastCleanDate;

	// new Room(123, RoomType.DELUXE);
	public Room(int roomNumber, RoomType type) {
		super();
		this.roomNumber = roomNumber;
		this.type = type;
	}

	public RoomType getType() {
		return type;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public Date getLastCleanDate() {
		return lastCleanDate;
	}

	public void setLastCleanDate(Date lastCleanDate) {
		this.lastCleanDate = lastCleanDate;
	}

	public boolean isClean() {

		// today 00:00:00
		Date today12am = new Date();
		today12am.setHours(0);
		today12am.setMinutes(0);
		today12am.setSeconds(0);

		// return !( lastCleanDate == null || lastCleanDate.before(today12am) );

		if (lastCleanDate == null || lastCleanDate.before(today12am)) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {

		return "No: " + roomNumber + ",Type:" + type;
	}

	public enum RoomType {
		TWIN_STANDARD, FRENCH_STANDARD, FRENCH_CLUB, TWIN_CLUB
	}

}
