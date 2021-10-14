package ex_regex;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		/*
		 * 워드 스크램블 - 단어의 철자를 섞어 놓고 원래 단어를 맞추는 게임
		 * => 주어진 문자열 중 문제로 사용할 요소를 임의로 선택
		 * => 선택한 문자열의 문자 순서를 뒤섞은 다음, 새로운 문자열로 출력
		 * ex) "ORACLE" 선택 시
		 *    문제 : COLAER
		 *    정답 : ORACLE
		 * */
		
		String[] strArr = {"JAVA","ANDROID","JSP","ORACLE","HTML5"};
		
		//정답이 저장될 문자열 
		String answer = getAnswer(strArr);
		
		//문제가 저장될 문자열
		String question = getScrambledWord(answer);
		
		System.out.println("문제 : "+question);
		System.out.println("정답 : "+answer);
		

	}

	private static String getAnswer(String[] strArr) {
		
		//난수를 추출하여 strArr 배열 중 하나의 값 추출
		int index = (int)(Math.random()*strArr.length); //난수 범위는 0~배열 크기-1
		
		//선택된 문자열 리턴 
		return strArr[index];
	}
	private static String getScrambledWord(String answer) {
		//선택된 문자열의 순서를 섞음(셔플)
		
		// 문자열을 셔플하기 위해서 char[] 배열로 저장
		char[] chArr = answer.toCharArray();
		
		for (int i = 0; i < chArr.length; i++) {
			//위치 변경할 난수 발생
			int index = (int)(Math.random()*chArr.length);
			
			//chaArr[i]<-> chArr[index]변경
			char temp = chArr[i];
			chArr[i] = chArr[index];
			chArr[index] = temp;
		}
		
		return new String(chArr); //String 타입 리턴을 위해서 새로운 인스턴스 생성
	}

}
