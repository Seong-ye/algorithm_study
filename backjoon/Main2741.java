package algorithm;

import java.util.Scanner;

public class Main2741 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(N<=100000) {
			for(int i=1; i<=N; i++) {
				System.out.println(i);
			}
		}

	}

}
