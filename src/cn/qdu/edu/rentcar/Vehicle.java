package cn.qdu.edu.rentcar;

public class Vehicle {
	private String vehicleNumber;// 车牌号
	private int dayRate;// 日租费

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getDayRate() {
		return dayRate;
	}

	public void setDayRate(int dayRate) {
		this.dayRate = dayRate;
	}

	// 构造函数，控制车牌号
	public Vehicle(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	// 总计费用
	public double charge(int day) {
		return day * dayRate;
	}
}
