package cn.qdu.edu.rentcar;

public class Car extends Vehicle {
	private String vehicleModel;

	public Car(String vehicleNumber,String carModel) {
		super(vehicleNumber);
		this.vehicleModel=carModel;
		// TODO Auto-generated constructor stub
	}

	public double charge(int day) {
		if (vehicleModel.equals("别克商务")) {
			setDayRate(600);

		} else if (vehicleModel.equals("宝马550i")) {
			setDayRate(500);
		} else if (vehicleModel.equals("别克林荫大道")) {
			setDayRate(300);
		}
		return super.charge(day);
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
}
