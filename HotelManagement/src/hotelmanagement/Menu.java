package hotelmanagement;

import java.util.Scanner;

public abstract class Menu {
	// interfacein icindeki hersey publictir Bu yuzden public belirtmemize gerek
	// olmaz.

	public abstract void printMenu();

	public abstract boolean operationMenu(int menu);

	public int getInput() {
		Scanner input = new Scanner(System.in);
		int menu1 = input.nextInt();
		return menu1;
	}

}
