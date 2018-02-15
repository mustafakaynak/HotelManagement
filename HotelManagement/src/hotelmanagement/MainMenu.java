package hotelmanagement;

import hotelmanagement.data.RoomDataBase;

public class MainMenu extends Menu {

	AccomadationManagement acc = new AccomadationManagement();
	CleaningReport hk;
	final RoomDataBase roomdbdRef;

	public MainMenu(final RoomDataBase roomdbd) {
		this.roomdbdRef = roomdbd;
		hk = new CleaningReport(roomdbd);
	}

	@Override
	public void printMenu() {
		System.out.println("**********");
		System.out.println("Menu");
		System.out.println("(1):Otel konaklama durumu");
		System.out.println("(2):Oda durumu");
		System.out.println("(3):Oda temizlik durumu");
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
			System.out.println("Oda durumunu sectiniz.");
			break;
		case 3:
			System.out.println("Oda temizlik durumunu sectiniz");
			hk.menuLoop();
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

}
