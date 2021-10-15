
import java.util.regex.Pattern;

public class PatternEX {

	public static void main(String[] args) {
		String[] variableNames = {
				"num", "myName","7eleven","channel#5","$ystem","my name","자바","a"
		};
		
		String regex = "^[A-za-z가-힣$_][A-za-z가-힣$_\\d]*$"; //{0,}대신 사용가능
		//영문자, 한글, 특수문자($,_)중 한글자로 시작하고
		//두번째 글자부터는 영문자, 숫자, 한글, 특수문자($,_)가 0번이상 반복
		
		for(String variableName : variableNames) {
			//Pattern.matches() 메서드 사용하여 판별
			boolean result = Pattern.matches(regex, variableName);
			System.out.println(variableName+" : "+result);
		}
	
	}

}
