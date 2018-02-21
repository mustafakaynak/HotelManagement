package hotelmanagement;

import java.util.List;

import hotelmanagement.data.RoomDataBase;
import hotelmanagement.model.Room;

public class CleaningReport extends Menu {

	public CleaningReport() {
	}

	@Override
	public void printMenu() {
		System.out.println("(1):List clean rooms");
		System.out.println("(2):List dirty rooms");
		System.out.println("(0):Back");
	}

	@Override
	public boolean operationMenu(int menu) {
		switch (menu) {
		case 1:
			System.out.println("List clean rooms.");

			List<Room> rooms = RoomDataBase.getRooms();

			for (Room r : rooms) {
				if (r.isClean() == true) {
					System.out.println(r);
				}
			}

			/*
			 * for (Iterator iterator = rooms.iterator(); iterator.hasNext();) { Room r =
			 * (Room) iterator.next(); if (r.isClean()) { System.out.println(r); } }
			 */

			break;
		case 2:
			System.out.println("List dirty rooms");
			List<Room> roomDirty = RoomDataBase.getRooms();
			for (Room r : roomDirty) {
				if (!r.isClean()) {
					System.out.println(r);
				}
			}
			break;
		case 0:
			System.out.println("Back");
			break;
		default:
			System.out.println("Wrong choice.");
			break;

		}
		return false;
	}

}
