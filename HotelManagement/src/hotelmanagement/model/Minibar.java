package hotelmanagement.model;

public class Minibar {
	private int cola = 1;
	private int fanta = 1;
	private int sprite = 1;
	private int limonata = 1;
	private int su = 2;
	private int soda = 2;
	private int enerji = 1;
	private int kuruyemis = 1;
	private int lokum = 1;
	private int kaju = 1;

	public Minibar() {

	}

	public Minibar(int cola, int fanta, int sprite, int limonata, int su, int soda, int enerji, int kuruyemis,
			int lokum, int kaju) {
		super();
		this.cola = cola;
		this.fanta = fanta;
		this.sprite = sprite;
		this.limonata = limonata;
		this.su = su;
		this.soda = soda;
		this.enerji = enerji;
		this.kuruyemis = kuruyemis;
		this.lokum = lokum;
		this.kaju = kaju;
	}

	public int getCola() {
		return cola;
	}

	public void setCola(int cola) {
		this.cola = cola;
	}

	public int getFanta() {
		return fanta;
	}

	public void setFanta(int fanta) {
		this.fanta = fanta;
	}

	public int getSprite() {
		return sprite;
	}

	public void setSprite(int sprite) {
		this.sprite = sprite;
	}

	public int getLimonata() {
		return limonata;
	}

	public void setLimonata(int limonata) {
		this.limonata = limonata;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getSoda() {
		return soda;
	}

	public void setSoda(int soda) {
		this.soda = soda;
	}

	public int getEnerji() {
		return enerji;
	}

	public void setEnerji(int enerji) {
		this.enerji = enerji;
	}

	public int getKuruyemis() {
		return kuruyemis;
	}

	public void setKuruyemis(int kuruyemis) {
		this.kuruyemis = kuruyemis;
	}

	public int getLokum() {
		return lokum;
	}

	public void setLokum(int lokum) {
		this.lokum = lokum;
	}

	public int getKaju() {
		return kaju;
	}

	public void setKaju(int kaju) {
		this.kaju = kaju;
	}

}
