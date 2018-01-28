package hotelmanagement;

public class MainMenu extends Menu {
	private AccomadationManagement acc = new AccomadationManagement();

	@Override
	public void printMenu() {
		System.out.println("***********************************");
		System.out.println("Menu:");
		System.out.println("(1) Otel konaklama durumu");
		System.out.println("(2) Oda yonetimi.");
		System.out.println("(3) Oda temizlik durumu:");
		System.out.println("(0) cýkýs.");
		System.out.println("0 ile 3 arasinda giris yapiniz.");
		System.out.println("***********************************");

	}

	@Override
	public boolean operationMenu(int mainMenu) {
		switch (mainMenu) {
		case 1:
			System.out.println("Otel konaklama durumunu sectiniz.");
			boolean menuExit = false;
			do {
				// uc ana adim var
				// 1 menu 2 kullanýcýnýn menu secimini aliýyoruz
				// 3 secime uygun operasyon
				acc.printMenu();
				int accmenu = acc.getMenuInput();
				menuExit = acc.operationMenu(accmenu);
			} while (menuExit == false);

			break;
		case 2:
			System.out.println("Oda yonetimi");
			break;
		case 3:
			System.out.println("Oda temizlik durumu");
			break;
		case 0:
			System.out.println("Program sonlaniyor.");
			System.exit(0);
			break;
		default:
			System.out.println("Gecersiz secim.");
			break;

		}
		return false;

	}

}
