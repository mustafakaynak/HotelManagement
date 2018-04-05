package hotelmanagement;

import java.util.Scanner;

import hotelmanagement.data.RoomDataBase;
import hotelmanagement.model.Room;

public abstract class Menu {
	// interfacein icindeki hersey publictir Bu yuzden public belirtmemize gerek
	// olmaz.

	public static Room selectRoom(Scanner input) {
		Room selectedRoom = null;
		while (true) {
			System.out.println("Select room");
			String roomNumber = input.next();
			selectedRoom = RoomDataBase.findRoom(roomNumber);
			if (selectedRoom != null) {
				break;
			} else {
				System.out.println("Wrong choice." + roomNumber + " Does not exist.");
			}
		}
		return selectedRoom;
	}

	public abstract void printMenu();

	public abstract boolean operationMenu(int menu);

	public int getInput() {
		Scanner input = new Scanner(System.in);
		int menu1 = input.nextInt();
		return menu1;
	}

	public void menuLoop() {
		boolean menuExit = false;
		do {
			printMenu();
			int menu = getInput();
			menuExit = operationMenu(menu);
		} while (menuExit == false);
	}

}
