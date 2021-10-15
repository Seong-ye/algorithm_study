package algorithm;

import java.util.Scanner;

public class Main2739 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n>=1 && n<=9) {
			for(int i = n; i<=n ; i++) {
				for(int j= 1; j<=9; j++) {
					System.out.println(n+"*"+j+"="+n*j);
				}
			}
		}

	}

}
