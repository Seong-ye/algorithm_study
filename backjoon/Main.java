package algorithm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(M < 45) {
			H--;
			M = (M+60)-45;
			if(H<0) {
				H=23;
			}
			System.out.println(H+" "+M);
		}
		else {
			M-=45;
			System.out.println(H+" "+M);
		}
	}
}
