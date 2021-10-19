package ex_generic;

import java.util.*;

public class Generic {

	public static void main(String[] args) {

		/*
		 * Person 클래스 인스턴스 2개를 생성
		 * "홍길동", 20 => p1
		 * "이순신", 44 => p2
		 * 
		 */
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("이순신", 44);
		
		// Person 객체 여러개를 하나의 객체에 저장하여 관리할 경우
		// 1. Object[] 배열을 통해 관리
		// => 배열은 크기가 불변이므로 추가적인 객체 저장 불가
		
		Object[] objectArr = {p1, p2}; // Person -> Object 업캐스팅 되어 관리됨
		
		for (int i = 0; i < objectArr.length; i++) {
			// Object[] 배열 내의 Person 객체를 Object 타입 변수에 저장하면
			// 업캐스팅 된 상태이므로 서브클래스인 Person 의 상세정보가 보이지 않는다!
			Object o = objectArr[i];
//			System.out.println(o.getName()); // 컴파일 에러 발생!
			
			// Object[] 배열 내의 Person 객체를 꺼내서 Person 타입 변수에 저장
//			Person p = objectArr[i]; // 다운캐스팅 필수!
			Person p = (Person) objectArr[i]; 
			
			// Getter 메서드를 호출하여 이름, 나이를 name, age 변수에 저장 후 출력
			String name = p.getName();
			int age = p.getAge();
			System.out.println(name + ", " + age);
			
		}
		
		System.out.println("===================================");
		
		// 2. Collection(ArrayList)을 활용하여 Person 객체 여러개를 관리할 경우
		// => 배열의 단점인 크기 불변을 해결하게 되므로 여러 객체를 자유롭게 추가 가능
		// 1) 제네릭을 사용하지 않을 경우
		//    - 파라미터 또는 리턴타입이 Object 타입이 되어 다양한 객체 저장 가능
		//    - 저장 시점에서 타입 판별이 이루어지지 않으므로 편리하지만 
		//      대신 데이터를 꺼내는 시점에서 타입 불일치에 따른 오류 발생 가능성이 존재!
		//    - 데이터를 꺼내기 전 instanceof 연산자를 통한 타입 판별을 수행해야하며
		//      Object 타입을 실제 데이터타입으로 다운캐스팅을 수행!
		List list = new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(new Person("강감찬", 35)); // 새로 추가되는 객체도 자동으로 확장되어 저장
		
		list.add("전지현"); // Person 객체가 아닌 데이터도 추가가 가능함
		// => Person 객체 형태로 꺼내서 사용하는 시점에서는 문제가 발생할 수 있다!
		
		// for문을 사용하여 ArrayList 객체 반복
		// => Person 타입 변수에 저장 후 Getter 메서드 호출
		// 일반 for문 사용 시
//		for (int i = 0; i < list.size(); i++) {
//			// 잘못된 데이터가 저장되어 있을 수도 있으므로 타입 판별 후 형변환 필요함
//			if (list.get(i) instanceof Person) { // list.get(i) 가 Person 타입인가?
//				Person p = (Person) list.get(i); // 리턴타입이 Object 이므로 Person 타입에 저장 불가
//				// => Object -> Person 다운 캐스팅!
//				
//				System.out.println(p.getName() + ", " + p.getAge());
//				
//			} else {
//				System.out.println("타입이 일치하지 않습니다!");
//				
//			}
//			
//			
//		}
//		
		//향상된 for문 사용 시
		for(Object o :list) {
			if(o instanceof Person) {
				Person p = (Person) o;
				System.out.println(p.getName()+", "+p.getAge());
			}else {
				System.out.println("타입 불일치");
			}
		}
		System.out.println("===================");
		// 2) 제네릭 타입을 사용할 경우
		//  => 저장할 객체 타입이 Person 타입이므로 제네릭 타입 <Person> 지정
		//  - 객체 저장 시 Person 타입 객체만 저장 가능하도록 자동으로 판별 수행
		//    즉, 잘못된 객체(데이터)가 저장될 우려가 없다
		//  - Object 타입으로 업캐스팅 되지 않고 Person 타입 자체로 저장되기 때문에
		//    객체를 꺼내는 시점에서도 Person 타입 그대로 꺼낼 수 있다
		//   => 별도의 다운 캐스팅 등 형변환 불필요
		//  - 또한, 추가적인 타입 판별도 불필요!
		
		List<Person> list2 = new ArrayList<Person>();
		//제네릭 타입<Person> 지정 시 사용 가능한 객체는 무조건 person타입 객체만 가능
		list2.add(p1);
		list2.add(p2);
		list2.add(new Person("강감찬",35)); //새로 추가되는 객체도 자동으로 확장되어 저장
		
		//Person 타입이 아닌 객체를 추가할 경우
		//데이터타입 판별에 의해 오류가 발생하게 된다
//		list2.add("전지현"); //컴파일에러 발생
		
		//반복문을 통해 list 객체의 모든 요소 꺼내서 출력
		//일반 for문 사용 시 Person 객체 변수에 저장하는 작업이 필요
		for(int i=0; i<list2.size(); i++) {
			Person p = list2.get(i); //리턴타입이 Person이므로 형변환 불필요!
			System.out.println(p.getName()+", "+p.getAge());
			
		}
		
		System.out.println("=============================");
		
		/*
		 * MemberBean 객체 3개 생성
		 * 생성자에 아이디, 패스워드, 이름, 이메일, 주소, 전화번호, 휴대폰번호 전달
		 * => 생성되는 3개의 객체를 ArrayList 객체에 추가(ArrayList 객체 생성 시 제네릭타입 지정)
		 * 반복문을 통해 ArrayList 객체 내의 MemberBean 객체를 꺼내서 출력
		 * */
		
		MemberBean mb1 = new MemberBean("Hong","1234","홍길동","hong@hong.com","Busan","0510000000","01011111111");
		MemberBean mb2 = new MemberBean("Kim","1234","김길동","kim@kim.com","Seoul","020000000","01011111111");
		MemberBean mb3 = new MemberBean("Lee","1234","이길동","Lee@lee.com","Ulsan","0520000000","01011111111");
	
		List<MemberBean> memberList = new ArrayList<MemberBean>();
		memberList.add(mb1);
		memberList.add(mb2);
		memberList.add(mb3);
		
		for(int i=0; i<memberList.size(); i++) {
			MemberBean mb = memberList.get(i); //형변환 불필요
			System.out.println(mb);
		}
		
		System.out.println("==================");
		
		for(MemberBean member : memberList) {
			System.out.println(member);
		}
	}

}

/*
 * MemberBean 클래스 정의
 * - 멤버변수 : id, pass, name, email, address, phone, mobile
 * - 생성자 : 멤버변수를 전달받아 초기화하는 생성자
 * - toString() 메서드 오버라이딩
 * */


class MemberBean{
	private String id,pass,name,email,address,phone,mobile;
	
	public MemberBean(String id, String pass, String name, String email, String address, String phone, String mobile) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "MemberBean [id=" + id + ", pass=" + pass + ", name=" + name + ", email=" + email + ", address="
				+ address + ", phone=" + phone + ", mobile=" + mobile + "]";
	}
	
}

/*
 * Person 클래스 정의
 * - 멤버변수 : 이름(name, 문자열), 나이(age, 정수) => private
 * - 생성자 : 이름과 나이를 전달받아 초기화하는 생성자
 * - toString() 메서드 오버라이딩(이름과 나이를 결합하여 리턴)
 * - Getter / Setter 정의
 * 
 */
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}


