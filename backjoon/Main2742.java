package algorithm;

import java.util.Scanner;

public class Main2742 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(N<=100000) {
			for(int i=N; i>=1; i--) {
				System.out.println(i);
			}
		}

	}

}
