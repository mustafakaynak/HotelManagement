package hotelmanagement;

public class MainMenu extends Menu {
	AccomadationManagement acc = new AccomadationManagement();
	CleaningReport hr = new CleaningReport();

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
			boolean menuExit = false;
			do {
				// uc ana adim var
				// 1 menu 2 kullanýcýnýn menu secimini aliýyoruz
				// 3 secime uygun operasyon
				acc.printMenu();
				int accMenu = acc.getInput();
				menuExit = acc.operationMenu(accMenu);
			} while (menuExit == false);

			break;
		case 2:
			System.out.println("Oda durumunu sectiniz.");
			break;
		case 3:
			System.out.println("Oda temizlik durumunu sectiniz");
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
