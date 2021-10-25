package algorithm;

import java.util.Scanner;

public class Main2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 1;
		int index = 0;
		for(int i=1; i<=9; i++) {
			int n = scan.nextInt();
			arr[i-1] = n;  
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}
			index++;
		}
		System.out.println(max);
		System.out.println(index);
	}

}
