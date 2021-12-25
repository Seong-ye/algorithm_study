package algorithm;

import java.util.Scanner;

public class Main1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		String arr[] = s.split(" ");
		
		if(arr.length == 0) {
			System.out.println(0);
			System.exit(0);
		}
		if(arr[0] == " ") {
			System.out.println(arr.length-1);
		} else {
			System.out.println(arr.length);
		}
	

	}

}
