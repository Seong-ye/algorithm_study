import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int winCount = 0;
		
		while(true) {
			
			Set myLotto = new TreeSet();
			
			//1) 1~45 사이의 중복되지 않는 숫자 6개를 Set객체에 저장 후 출력
			// => Set 객체는 중복을 자동으로 제거하므로 저장된 요소가 6개가 될때까지 반복
			
			while(myLotto.size() < 6) { //저장되는 요소 갯수가 6개가 되면 자동으로 반복 종료
				myLotto.add(r.nextInt(45)+1); //난수 생성 후 바 Set객체 에 저장
				//만약 중복된 난수가 발생할 경우 자동으로 제거됨
			}
			
			System.out.println("나의 로또번호 : "+myLotto);
			
			//2) 1등 당첨 번호(7,3,21,12,40,33)를 저장하는 Set 객체(thisWeekLotto) 생성
			Set thisWeekLotto = new TreeSet();
			thisWeekLotto.add(7);
			thisWeekLotto.add(3);
			thisWeekLotto.add(21);
			thisWeekLotto.add(12);
			thisWeekLotto.add(40);
			thisWeekLotto.add(33);
			
			System.out.println("1등 당첨 번호 : "+thisWeekLotto);
			
			//3) 자신의 로또 번호와 1등 당첨 번호를 비교하여 일치하는 번호 갯수 출력하고
			//   일치하는 번호 갯수에 따른 결과 출력
			// => 향상된 for문을 사용하여 Set 객체의 요소를 꺼내서 Object 타입으로 저장 
			int count = 0;
			
			for (Object o :thisWeekLotto) {
				//thisWeekLotto에서 꺼낸 번호 1개가 MyLotto 요소에 포함되는지 판별하여
				//포함되는 경우 카운트를 저장하는 변수 count를 1증가 시키기
				if(myLotto.contains(o)) {
					count++;
					
				}
			}
			
			//일치하는 번호 갯수에 따른 결과 출력
			String result = "";
			switch (count){
			case 6 : result = "1등"; break;
			case 5 : result = "2등"; break;
			case 4 : result = "3등"; break;
			case 3 : result = "4등"; break;
			default : result = "꽝";
			}
			System.out.println("일치하는 번호 갯수 : "+count+"개"+"("+result+")");
			
			System.out.println("========================");
			
			//추첨 횟수 카운트
			winCount++;
			
			//1등 당첨일 경우 반복문 종료
			if(count == 6) {
				break;
			}
		}
		
		System.out.println("1등 당첨까지 걸린 추첨횟수 : " +winCount + "회");
		
	}

}
