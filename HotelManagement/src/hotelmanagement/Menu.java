package hotelmanagement;

import java.util.Scanner;

public abstract class Menu {
	// interfacein icindeki hersey publictir Bu yuzden public belirtmemize gerek
	// olmaz.

	public abstract void printMenu();

	public abstract boolean operationMenu(int menu);

	public int getMenuInput() {
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();
		return menu;
	}

}
