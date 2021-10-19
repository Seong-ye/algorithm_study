package ex_stack;

import java.util.Stack;

public class stackEx {

	public static void main(String[] args) {
		/*
		 * Stack 객체 1개 생성
		 * => 웹사이트 주소 5개 추가
		 * ex)
		 * www.github.com
		 * www.naver.com
		 * www.youtube.com
		 * www.nate.com
		 * www.gmarket.co.kr
		 * => 반복문 사용하여 Top에서부터 하나씩 객체를 꺼내서 출력
		 * */
		
		Stack s = new Stack();
		
		s.push("1.www.github.com");
		s.push("2.www.naver.com");
		s.push("3.www.youtube.com");
		s.push("4.www.nate.com");
		s.push("5.www.gmarket.co.kr");
		
		System.out.println("Stack에 저장된 요소 : "+s);
		System.out.println("Stack에 저장된 요소 갯수 : "+s.size());
		
		//for문을 사용할 경우
//		for(int i=1; s.size()>0; i++) {
//			//주의 일반 for문 조건식에 i<stack.size() 형태로 제어변수 비교할 경우
//			//pop() 메서드를 통해 요소를 꺼낼때마다 size() 값이 줄어들게 됨
//			//=> 반복이 끝까지 원할하게 진행되지 못하게 됨
//			System.out.println(s.pop());
//		}
		
		System.out.println("=======================");
		//while문 사용할 경우
		while(s.size()>0) {
			System.out.println(s.pop());
		}
		
		
		
	}

}
