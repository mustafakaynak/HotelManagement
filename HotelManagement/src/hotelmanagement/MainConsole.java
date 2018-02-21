package hotelmanagement;

public class MainConsole {

	public static void main(String[] args) {

		MainMenu menu1 = new MainMenu();

		while (true) {
			menu1.printMenu();
			int menu = menu1.getInput();
			menu1.operationMenu(menu);
		}

	}

}
