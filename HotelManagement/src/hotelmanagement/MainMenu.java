package hotelmanagement;

import java.util.Scanner;

import hotelmanagement.data.RoomDataBase;
import hotelmanagement.model.LobbyBavarage;
import hotelmanagement.model.Room;

public class MainMenu extends Menu {
	AccomadationManagement acc = new AccomadationManagement();
	CleaningReport hk;

	public MainMenu() {

		hk = new CleaningReport();
	}

	@Override
	public void printMenu() {
		System.out.println("**********");
		System.out.println("Menu");
		System.out.println("(1):Otel konaklama durumu");
		System.out.println("(2):Oda temizlik durumu");
		System.out.println("(3):Choose lobby bavarage");
		System.out.println("(0): Cýkýs");
		System.out.println("o ile 3 arasinda giris yapiniz");
		System.out.println("***************");

	}

	@Override
	public boolean operationMenu(int menu) {
		switch (menu) {
		case 1:
			System.out.println("Otel konaklama durumunu sectiniz.");
			boolean menuExit = false;
			do {
				acc.printMenu();
				int accMenu = acc.getInput();
				menuExit = acc.operationMenu(accMenu);
			} while (menuExit == false);

			break;
		case 2:
			System.out.println("Oda temizlik durumu.");
			hk.menuLoop();
			break;
		case 3:
			System.out.println("Choose lobby bavarage");
			lobbyBavarageOperation();
			break;

		case 0:
			System.out.println("Cikis yapiyorsunuz.");
			System.exit(0);
			break;
		default:
			System.out.println("Yanlis tuslama yaptiniz.");
			break;

		}
		return false;
	}

	private void lobbyBavarageOperation() {
		Scanner input = new Scanner(System.in);

		System.out.println("Write roomNumber");
		String roomNumber = input.next();

		Room selectedRoom = RoomDataBase.findRoom(roomNumber);

		System.out.println("Write product type");
		String productType = input.next();

		System.out.println("Write quantity");
		int quantity = input.nextInt();

		LobbyBavarage b = selectedRoom.getLobbyBavarage();
		b.add(quantity, productType);

	}

}
