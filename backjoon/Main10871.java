package algorithm;

import java.util.Scanner;

public class Main10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] a = new int[n];
		
		for(int i=1; i<=n; i++) {
			int n1 = scan.nextInt();
			a[i-1] = n1; 
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<x) {
				System.out.print(a[i]+" ");
			}
		}

	}

}
