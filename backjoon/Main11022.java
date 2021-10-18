package algorithm;

import java.util.Scanner;

public class Main11022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int T = scan.nextInt();
		int[] arr = new int[T];
		int[] arr1 = new int[T];
		int[] arr2 = new int[T];
		
		for(int i=0; i<arr.length; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			arr[i] = A+B;
			arr1[i] = A;
			arr2[i] = B;
			
		}	
		for(int i=0; i<arr.length; i++) {
			System.out.println("Case #"+(i+1)+": "+arr1[i]+" + "+arr2[i]+" = "+arr[i]);
		}
		
	}

}
