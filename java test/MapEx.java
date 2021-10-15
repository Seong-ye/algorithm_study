package ex_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		// 키로 사용할 데이터 : Person 객체
		// 값으로 사용할 데이터 : 전화번호
		// key						 	value
		// "홍길동", "901010-1234567" / "010-1234-5678"
		// "이순신", "911910-1111111" / "010-2222-3333"
		// "홍길동", "901010-1234567" / "010-3333-4444"
		
		
		map.put(new Person("홍길동","901010-1234567"), "010-1234-5678");
		map.put(new Person("이순신","911910-1111111"), "010-2222-3333");
		map.put(new Person("홍길동","901010-1234567"), "010-3333-4444");
		//=> Person 객체를 키로 갖는 경우
		//   new연산자를 통해 객체 생성 코드를 키에 전달할 경우
		//   데이터는 동일하지만 생성된 객체의 주소값이 다르므로
		//   서로 다른 키로 인식됨 
		//   따라서 이름과 주민번호가 같은 객체라도 서로 다른 전화번호가 
		//   별개의 위치에 저장됨
		
		
		System.out.println(map);
		System.out.println("map 객체의 요소 갯수 "+map.size());
		
		System.out.println("=========================");
		
		Map map2 = new HashMap();
		Person p = new Person("홍길동", "901010-1234567");
		
		map2.put(p, "010-1234-5678");
		map2.put(p, "010-3333-4444");
		//Person 객체의 참조변수 p를 키에 두번 전달하는 경우
		//전화번호가 다르더라도 참조변수는 1개이므로 하나의 키로 인식됨
		//따라서 이름과 주민번호가 같은 객체는 뒤의 전화번호를 덮어쓰게 됨
		System.out.println(map2);
		
		System.out.println("=======================");
		
		//map객체의 값을 모두 출력
		//ex) 이름 : xxx, 전화번호 : xxx, 주민번호 : xxx
		//모든 키 꺼내기
		Set keySet = map.keySet();
		
		//Iterator 객체 생성
		Iterator iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			Person person = (Person)iterator.next(); //키 값을 person타입 변수에 저장
			
			System.out.println("이름 : "+person.name + "전화번호 : "+map.get(person)+",주민등록번호"+person.jumin);
		}
	}

}

//Person 클래스 정의
//이름(name), 주민등록번호(jumin)
//생성자, toString() 오버라이딩 작성

class Person {
	String name;
	String jumin;
	
	public Person(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", jumin=" + jumin + "]";
	}
	
	
	
}