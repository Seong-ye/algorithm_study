package ex_thread;

public class multiThread_gu {

	public static void main(String[] args) {
		/*
		 * Gugudan 인스턴스 3개 생성(각각 다른 단을 생성자에 전달)
		 * 서로 다른 구구단이 동시에 100번씩 출력
		 * 
		 * */
		
		Thread t1 = new Thread(new Gugudan(3));
		Thread t2 = new Thread(new Gugudan(6));
		Thread t3 = new Thread(new Gugudan(9));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
/*
 * Gugudan 클래스 정의 - Runnable 인터페이스 구현
 * - 멤버변수(int형 정수 dan)
 * - 생성자(int형 변수 dan을 초기화하는 정수 입력받도록 정의
 * - run() 메서드 내부에서 dan에 해당하는 구구단을 100번 반복 출력 => 멀티쓰레드
 * 
 * */
 class Gugudan implements Runnable{
	 int dan;
	 int i;
	 
	public Gugudan(int dan) {
		super();
		this.dan = dan;
	}
	
	@Override
	public void run() {
		for(int j=1; j<=100; j++) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d단 : %d * %d = %d\n",dan,dan,i,dan*i);
			}
		}
	}
	 
 }