package cn.qdu.edu.rentcar;

import java.util.Scanner;

public class RentSystem {
	Vehicle[] model;

	public void rent() {
		Scanner input = new Scanner(System.in);
		int vehicleCount = 0;// ������
		int key = 0;
		int i = 0;

		System.out.println("*******��ӭ�����⳵ϵͳ*******");

		System.out.println("�������������");
		int day = input.nextInt();
		System.out.println("��ѡ����賵����Ŀ");

		vehicleCount = input.nextInt();

		model = new Vehicle[vehicleCount];

		do {
			System.out.println("��ѡ���" + (i + 1) + "����");
			System.out.println("��ѡ�������ͣ�1���γ�2���ͳ�");
			key = input.nextInt();
			switch (key) {
			case 1:
				System.out.println("��ѡ��γ�Ʒ�ƣ�1��������� 2������ 550i 3�����������");
				String carModels[] = { "�������", "����550i", "���������" };
				int sexl1 = input.nextInt();

				int n = (int) ((Math.random() * 9 + 1) * 10000);// ����5λ������������ƺ�
				model[i] = new Car("³A" + n, carModels[sexl1 - 1]);
				System.out.println("----------------------------------------------------------------------");
				i++;
				break;
			case 2:
				System.out.println("��ѡ�������Ŀͳ���λ��1��<=16�� 2��>16��");
				int seatNumber[] = { 10, 18 };
				int sexl = input.nextInt();

				int m = (int) ((Math.random() * 9 + 1) * 10000);// ����5λ������������ƺ�

				model[i] = new PassgerCar("³B" + m, seatNumber[sexl - 1]);

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
				
				System.out.println("�������"+((Car)model[j]).getVehicleModel()+" "+model[j].getDayRate()+"  ���ƺ� "+model[j].getVehicleNumber());
			}else {
				System.out.println(((PassgerCar)model[j]).getSeatNumber()+"  �����"+model[j].getDayRate()+"  ���ƺ� "+model[j].getVehicleNumber());
			}

		}
		System.out.println("�ܼƷ��ã�" + totalFee);
		System.out.println("ллʹ���⳵ϵͳ����ӭ�´ι���");
	}

	public static void main(String[] args) {
		RentSystem system = new RentSystem();
		system.rent();

	}
}
