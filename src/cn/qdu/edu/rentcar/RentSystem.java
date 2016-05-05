package cn.qdu.edu.rentcar;

import java.util.Scanner;

public class RentSystem {
	Vehicle[] model;

	public void rent() {
		Scanner input = new Scanner(System.in);
		int vehicleCount = 0;// 车辆数
		int key = 0;
		int i = 0;

		System.out.println("*******欢迎进入租车系统*******");

		System.out.println("请输入租借天数");
		int day = input.nextInt();
		System.out.println("请选择租借车辆数目");

		vehicleCount = input.nextInt();

		model = new Vehicle[vehicleCount];

		do {
			System.out.println("请选择第" + (i + 1) + "辆车");
			System.out.println("请选择车辆类型：1、轿车2、客车");
			key = input.nextInt();
			switch (key) {
			case 1:
				System.out.println("请选择轿车品牌：1、别克商务 2、宝马 550i 3、别克林荫大道");
				String carModels[] = { "别克商务", "宝马550i", "别克林荫大道" };
				int sexl1 = input.nextInt();

				int n = (int) ((Math.random() * 9 + 1) * 10000);// 产生5位随机数，做车牌号
				model[i] = new Car("鲁A" + n, carModels[sexl1 - 1]);
				System.out.println("----------------------------------------------------------------------");
				i++;
				break;
			case 2:
				System.out.println("请选择所租借的客车座位数1、<=16座 2、>16座");
				int seatNumber[] = { 10, 18 };
				int sexl = input.nextInt();

				int m = (int) ((Math.random() * 9 + 1) * 10000);// 产生5位随机数，做车牌号

				model[i] = new PassgerCar("鲁B" + m, seatNumber[sexl - 1]);

				System.out.println("----------------------------------------------------------------------");
				i++;
				break;

			default:
				break;
			}
		} while (i < model.length);
		input.close();
		result(day);
	}

	public void result(int day) {
		double totalFee = 0;
		for (int j = 0; j < model.length; j++) {
			double fee = model[j].charge(day);
			totalFee += fee;
			if(model[j] instanceof Car){
				
				System.out.println("你租借了"+((Car)model[j]).getVehicleModel()+" "+model[j].getDayRate()+"  车牌号 "+model[j].getVehicleNumber());
			}else {
				System.out.println(((PassgerCar)model[j]).getSeatNumber()+"  日租金"+model[j].getDayRate()+"  车牌号 "+model[j].getVehicleNumber());
			}

		}
		System.out.println("总计费用：" + totalFee);
		System.out.println("谢谢使用租车系统！欢迎下次光临");
	}

	public static void main(String[] args) {
		RentSystem system = new RentSystem();
		system.rent();

	}
}
