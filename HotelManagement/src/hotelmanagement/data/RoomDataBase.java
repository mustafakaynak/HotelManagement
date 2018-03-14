package hotelmanagement.data;

import java.util.ArrayList;
import java.util.List;

import hotelmanagement.model.Room;

public final class RoomDataBase {
	private static List<Room> rooms = initRooms();

	private RoomDataBase() {
		super();
	}

	private static List<Room> initRooms() {

		List<Room> tmp = new ArrayList<>();

		Room r1 = new Room(101, Room.RoomType.FRENCH_CLUB);
		tmp.add(r1);
		Room r2 = new Room(102, Room.RoomType.TWIN_CLUB);
		tmp.add(r2);
		Room r3 = new Room(103, Room.RoomType.TWIN_STANDARD);
		tmp.add(r3);
		Room r4 = new Room(104, Room.RoomType.FRENCH_STANDARD);
		tmp.add(r4);
		Room r5 = new Room(201, Room.RoomType.FRENCH_CLUB);
		tmp.add(r5);
		Room r6 = new Room(202, Room.RoomType.TWIN_CLUB);
		tmp.add(r6);
		Room r7 = new Room(203, Room.RoomType.TWIN_STANDARD);
		tmp.add(r7);
		Room r8 = new Room(204, Room.RoomType.FRENCH_STANDARD);
		tmp.add(r8);
		Room r9 = new Room(301, Room.RoomType.FRENCH_CLUB);
		tmp.add(r9);
		Room r10 = new Room(302, Room.RoomType.TWIN_CLUB);
		tmp.add(r10);
		Room r11 = new Room(303, Room.RoomType.TWIN_STANDARD);
		tmp.add(r11);
		Room r12 = new Room(304, Room.RoomType.FRENCH_STANDARD);
		tmp.add(r12);
		Room r13 = new Room(401, Room.RoomType.FRENCH_CLUB);
		tmp.add(r13);
		Room r14 = new Room(402, Room.RoomType.TWIN_CLUB);
		tmp.add(r14);
		Room r15 = new Room(403, Room.RoomType.TWIN_STANDARD);
		tmp.add(r15);
		Room r16 = new Room(404, Room.RoomType.FRENCH_STANDARD);
		tmp.add(r16);
		Room r17 = new Room(501, Room.RoomType.FRENCH_CLUB);
		tmp.add(r17);
		Room r18 = new Room(502, Room.RoomType.TWIN_CLUB);
		tmp.add(r18);
		Room r19 = new Room(503, Room.RoomType.TWIN_STANDARD);
		tmp.add(r19);
		Room r20 = new Room(504, Room.RoomType.FRENCH_STANDARD);
		tmp.add(r20);
		Room r21 = new Room(601, Room.RoomType.FRENCH_CLUB);
		tmp.add(r21);
		Room r22 = new Room(602, Room.RoomType.TWIN_CLUB);
		tmp.add(r22);
		Room r23 = new Room(603, Room.RoomType.TWIN_STANDARD);
		tmp.add(r23);
		Room r24 = new Room(604, Room.RoomType.FRENCH_STANDARD);
		tmp.add(r24);
		Room r25 = new Room(701, Room.RoomType.FRENCH_CLUB);
		tmp.add(r25);
		Room r26 = new Room(702, Room.RoomType.TWIN_CLUB);
		tmp.add(r26);
		Room r27 = new Room(703, Room.RoomType.TWIN_STANDARD);
		tmp.add(r27);
		Room r28 = new Room(704, Room.RoomType.FRENCH_STANDARD);
		tmp.add(r28);

		return tmp;
	}

	public static List<Room> getRooms() {
		return rooms;

	}

	public static List<Room> getCleanRooms() {
		List<Room> tmp = new ArrayList<>();
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).isClean()) {
				tmp.add(rooms.get(i));
			}

		}
		return tmp;
	}

	public static List<Room> getDirtyRooms() {
		// TODO bir liste don.bu liste icinde sadece kirli odalar bulunsun
		List<Room> tmp = new ArrayList<>();
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).isClean() == false) {
				tmp.add(rooms.get(i));
			}
		}

		return tmp;
	}

	public static void printEmptyRooms() {
		for (int i = 0; i < rooms.size(); i++) {
			Room room = rooms.get(i);
			if (room.isEmpty()) {
				System.out.println(room);
			}
		}
	}

	public static Room findRoom(String roomNumber) {
		for (int i = 0; i < rooms.size(); i++) {
			Room room = rooms.get(i);

			// Yontem 1
			String roomNoStr = "" + room.getRoomNumber(); // string + int = String
			if (roomNumber.equals(roomNoStr)) {
				return room;
			}

			/*--
			// Yontem 2
			String roomNoStr2 = String.valueOf(room.getRoomNumber());
			if (roomNumber.equals(roomNoStr2)) {
				return room;
			}

			// Yontem 3
			int roomInt = Integer.parseInt(roomNumber);
			if (roomInt == room.getRoomNumber()) {
				return room;
			}

			// Yontem 4
			int roomInt2 = Integer.valueOf(roomNumber);
			if (roomInt2 == room.getRoomNumber()) {
				return room;
			}
			*/

		}
		return null;
	}

}
