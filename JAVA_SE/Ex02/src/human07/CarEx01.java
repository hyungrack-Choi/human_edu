package human07;

public class CarEx01 {

	public static void main(String[] args) {


		Car car1 = new Car("현대", "그랜져", 250, 100);
		Car car2 = new Car("기아", "k7", 200, 50);
		
		System.out.println("car1.현재속도 ==>" + car1.currentSpeed);
		System.out.println("car2.현재속도 ==>" + car2.currentSpeed);
		System.out.println();
		car1.speedUp();
		
		System.out.println("car1.현재속도 ==>" + car1.currentSpeed);
		System.out.println("car2.현재속도 ==>" + car2.currentSpeed);
		System.out.println();
		car2.speedUp(10);
		System.out.println("car1.현재속도 ==>" + car1.currentSpeed);
		System.out.println("car2.현재속도 ==>" + car2.currentSpeed);
		System.out.println();
		
		int car1CurrentSpeed = car1.speedDown(20);
		System.out.println("car1.현재속도 ==>" + car1CurrentSpeed);
		System.out.println("car2.현재속도 ==>" + car2.currentSpeed);
		System.out.println();

		car2.speedUp(130);		
		System.out.println("car2.현재속도 ==>" + car2.currentSpeed);

		car2.speedUp(300);		
		System.out.println("car2.현재속도 ==>" + car2.currentSpeed);

		
	}
}