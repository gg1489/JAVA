package 알고리즘_06_24_별찍기_문자열;

import java.util.Scanner;

public class fox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {} ;
		String result[] = {};
				
		Scanner s = new Scanner(System.in);
		
		
		for(int i=0; i<100; i++) {
			arr[i] += s;
		}
		
		System.out.println("what does the fox say?");
		for(int i=0; i<100; i++) {
			if(arr[i]=="wa" || arr[i]=="pa" || arr[i]=="pow") {
				System.out.printf("%s ", arr[i]);
				//result[i] += arr[i];
			}
		}
		
		//System.out.print("%s", result[i]);
	}

}
