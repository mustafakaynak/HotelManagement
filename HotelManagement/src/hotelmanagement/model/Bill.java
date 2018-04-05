package hotelmanagement.model;

public class Bill {
	private double roomPrice;
	private int days;
	private double extra = 0;

	public Bill(double roomPrice, int days) {

		this.roomPrice = roomPrice;
		this.days = days;
	}

	public void setExtra(double extra) {
		this.extra = extra;
	}

	public int addDays(int extraDays) {
		days = days + extraDays;
		return days;
	}

}
