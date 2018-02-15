package hotelmanagement.data;

import java.util.ArrayList;
import java.util.List;

import hotelmanagement.model.Room;

public class RoomDataBase {
	private List<Room> rooms = new ArrayList<>();

	public RoomDataBase() {
		Room r1 = new Room(101, Room.RoomType.FRENCH_CLUB);
		rooms.add(r1);
		Room r2 = new Room(102, Room.RoomType.TWIN_CLUB);
		rooms.add(r2);

	}

	public List<Room> getRooms() {
		return rooms;
	}
}
