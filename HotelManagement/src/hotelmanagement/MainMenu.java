package hotelmanagement;

public class MainMenu extends Menu {

	private AccomadationManagement acc;
	private CleaningReport hk;

	public MainMenu() {
		hk = new CleaningReport();
		acc = new AccomadationManagement();
	}

	@Override
	public void printMenu() {
		System.out.println("**********");
		System.out.println("Menu");
		System.out.println("(1):Otel konaklama durumu");
		System.out.println("(2):Oda durumu");
		System.out.println("(3):Oda temizlik durumu");
		System.out.println("(4)Restorant kontrol durumu");
		System.out.println("(0): Cýkýs");
		System.out.println("0 ile 4 arasinda giris yapiniz");
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
		case 4:
			System.out.println("Restoran durumunu sectiniz.");
			// TODO
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
