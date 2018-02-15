package hotelmanagement;

import hotelmanagement.data.RoomDataBase;

public class MainConsole {

	public static void main(String[] args) {
		RoomDataBase roomdbd = new RoomDataBase();

		MainMenu menu1 = new MainMenu(roomdbd);

		while (true) {
			menu1.printMenu();
			int menu = menu1.getInput();
			menu1.operationMenu(menu);
		}

	}

}
