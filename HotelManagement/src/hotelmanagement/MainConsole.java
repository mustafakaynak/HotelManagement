package hotelmanagement;

public class MainConsole {

	public static void main(String[] args) {
		MainMenu main1 = new MainMenu();

		while (true) {
			main1.printMenu();

			int menu = main1.getMenuInput();

			main1.operationMenu(menu);
		}

	}

}
