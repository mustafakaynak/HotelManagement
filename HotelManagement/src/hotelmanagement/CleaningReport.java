package hotelmanagement;

import java.util.List;

import hotelmanagement.data.RoomDataBase;
import hotelmanagement.model.Room;

public class CleaningReport extends Menu {
	private RoomDataBase roomdbd;

	public CleaningReport(RoomDataBase roomdbd) {
		this.roomdbd = roomdbd;
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

			List<Room> rooms = roomdbd.getRooms();

			for (Room r : rooms) {
				if (r.isClean()) {
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
			break;

		}
		return false;
	}

}
