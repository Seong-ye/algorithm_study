package ex_thread;

public class multiTh {

	public static void main(String[] args) {
		//Thread 객체 생성 및 Runnable 인터페이스 구현과 객체 생성, 전달을 한꺼번에 수행
		//main() 메서드 내에서
		// "메시지 송신", "메시지 수신", "파일 전송" 출력하는 작업을 동시에 100번씩 수행
		
		//=> 0.5초 단위로 출력되도록 코드 수정
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				
				for(int i=1; i<=100; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i+"메시지 송신");
				}
				
			}
			
		});
	
		t.start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				for(int i=1; i<=100; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i+"메시지 수신");
				}
				
			}
			
		});
	
		t.start();
		new Thread(new Runnable() {

			@Override
			public void run() {
			
				for(int i=1; i<=100; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i+"파일 전송");
				}
				
			}
			
		});
	
		t.start();
		
		
	}

}
