package human01;

public interface RemoteControl {
	//1.추상메서드
	public void turnOn();
	//인터페이스와 인터페이스 내의 메서드는 abstract라는
	//키워드가 생략됨.
	//컴파일과정에서 자동으로 생성된다.
	public void turnOFF();
	public void setVolume(int volume);
	
	//2. 상수를 관리할수있다.(static final)
	public static int MIN_VOL = 0;
	public static int MAX_VOL = 10;
	
	//3.default메서드 (JAVA8버전 이후의 기능)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		}
		else {
			System.out.println("무음 해제");
		}
	}
	//4.static 메서드 (인터페이스 차원의 메서드)
	//JAVA버전 이후의 기능
	static void changeBatt() {
		System.out.println("배터리는 교체하다.");
	}
}