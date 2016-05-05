package cn.qdu.edu.rentcar;

public class PassgerCar extends Vehicle {
	private int seatNumber;

	public PassgerCar(String vehicleNumber, int seatNumber) {
		super(vehicleNumber);
		this.seatNumber = seatNumber;
		// TODO Auto-generated constructor stub
	}

	public double charge(int day) {
		if (seatNumber <= 16) {
			setDayRate(800);

		} else {
			setDayRate(1500);
		}
		return super.charge(day);
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
}
