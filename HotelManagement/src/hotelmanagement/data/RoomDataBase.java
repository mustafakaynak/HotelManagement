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
		Room r3 = new Room(103, Room.RoomType.TWIN_STANDARD);
		rooms.add(r3);
		Room r4 = new Room(104, Room.RoomType.FRENCH_STANDARD);
		rooms.add(r4);
		Room r5 = new Room(201, Room.RoomType.FRENCH_CLUB);
		rooms.add(r5);
		Room r6 = new Room(202, Room.RoomType.TWIN_CLUB);
		rooms.add(r6);
		Room r7 = new Room(203, Room.RoomType.TWIN_STANDARD);
		rooms.add(r7);
		Room r8 = new Room(204, Room.RoomType.FRENCH_STANDARD);
		rooms.add(r8);
		Room r9 = new Room(301, Room.RoomType.FRENCH_CLUB);
		rooms.add(r9);
		Room r10 = new Room(302, Room.RoomType.TWIN_CLUB);
		rooms.add(r10);
		Room r11 = new Room(303, Room.RoomType.TWIN_STANDARD);
		rooms.add(r11);
		Room r12 = new Room(304, Room.RoomType.FRENCH_STANDARD);
		rooms.add(r12);
		Room r13 = new Room(401, Room.RoomType.FRENCH_CLUB);
		rooms.add(r13);
		Room r14 = new Room(402, Room.RoomType.TWIN_CLUB);
		rooms.add(r14);
		Room r15 = new Room(403, Room.RoomType.TWIN_STANDARD);
		rooms.add(r15);
		Room r16 = new Room(404, Room.RoomType.FRENCH_STANDARD);
		rooms.add(r16);
		Room r17 = new Room(501, Room.RoomType.FRENCH_CLUB);
		rooms.add(r17);
		Room r18 = new Room(502, Room.RoomType.TWIN_CLUB);
		rooms.add(r18);
		Room r19 = new Room(503, Room.RoomType.TWIN_STANDARD);
		rooms.add(r19);
		Room r20 = new Room(504, Room.RoomType.FRENCH_STANDARD);
		rooms.add(r20);
		Room r21 = new Room(601, Room.RoomType.FRENCH_CLUB);
		rooms.add(r21);
		Room r22 = new Room(602, Room.RoomType.TWIN_CLUB);
		rooms.add(r22);
		Room r23 = new Room(603, Room.RoomType.TWIN_STANDARD);
		rooms.add(r23);
		Room r24 = new Room(604, Room.RoomType.FRENCH_STANDARD);
		rooms.add(r24);
		Room r25 = new Room(701, Room.RoomType.FRENCH_CLUB);
		rooms.add(r25);
		Room r26 = new Room(702, Room.RoomType.TWIN_CLUB);
		rooms.add(r26);
		Room r27 = new Room(703, Room.RoomType.TWIN_STANDARD);
		rooms.add(r27);
		Room r28 = new Room(704, Room.RoomType.FRENCH_STANDARD);
		rooms.add(r28);

	}

	public List<Room> getRooms() {
		return rooms;
	}
}
