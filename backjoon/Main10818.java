package algorithm;

import java.util.Scanner;

public class Main10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		int max = -999999;
		int min = 9999999;
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			
		}
		for(int j=0;j<arr.length; j++) {
			if(arr[j]>max) {
				max = arr[j];
			}
			if(arr[j]<min) {
				min = arr[j];
			}
		}
		System.out.print(max+" "+min);

	}

}
