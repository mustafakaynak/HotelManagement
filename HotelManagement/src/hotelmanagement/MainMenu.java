package hotelmanagement;

import java.util.Scanner;

import hotelmanagement.data.RoomDataBase;
import hotelmanagement.model.LobbyBeverage;
import hotelmanagement.model.Product;
import hotelmanagement.model.Room;

public class MainMenu extends Menu {
	private Menu acc = new AccomadationManagement();
	private CleaningReport hk;

	public MainMenu() {
		hk = new CleaningReport();
	}

	@Override
	public void printMenu() {
		System.out.println("**********");
		System.out.println("Menu");
		System.out.println("(1):Otel konaklama durumu");
		System.out.println("(2):Oda temizlik durumu");
		System.out.println("(3):Choose lobby beverage");
		System.out.println("(0): Cýkýs");
		System.out.println("o ile 3 arasinda giris yapiniz");
		System.out.println("***************");

	}

	@Override
	public boolean operationMenu(int menu) {
		switch (menu) {
		case 1:
			System.out.println("Otel konaklama durumunu sectiniz.");
			acc.menuLoop();

			break;
		case 2:
			System.out.println("Oda temizlik durumu.");
			hk.menuLoop();
			break;
		case 3:
			System.out.println("Choose lobby bavarage");
			lobbyBeverageOperation();
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

	private void lobbyBeverageOperation() {
		Scanner input = new Scanner(System.in);

		System.out.println("Write roomNumber");
		String roomNumber = input.next();

		Room selectedRoom = RoomDataBase.findRoom(roomNumber);

		System.out.println("Write product type");
		String productType = input.next();

		System.out.println("Write quantity");
		int quantity = input.nextInt();

		LobbyBeverage b = selectedRoom.getLobbyBeverage();
		Product p = b.add(quantity, productType);
		if (p == null) {
			System.out.println("we don't have this type of product.");
		}

	}

}
