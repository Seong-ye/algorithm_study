package algorithm;

import java.util.Scanner;

public class Main11021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int[] arr = new int[T];
		
		for(int i=0; i<arr.length; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			arr[i] = A+B;	
		}	
		for(int i=0; i<arr.length; i++) {
			System.out.println("Case #"+(i+1)+": "+arr[i]);
		}
		
	}

}
