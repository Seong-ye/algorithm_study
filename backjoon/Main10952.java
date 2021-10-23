package algorithm;

import java.util.Scanner;

public class Main10952 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a=0, b=0, sum=0;
		
		while(true) {
			a = scan.nextInt();
			b = scan.nextInt();
			if(a==0 && b==0) {
				break;
			}
			System.out.println(a+b);
		}
		

	}

}
