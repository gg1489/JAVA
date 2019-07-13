package 알고리즘_06_24_별찍기_문자열;
import java.util.Scanner;

public class 별찍기6_2443번 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0, a=n-1; i<n; i++, a--) {
		    for(int j=0; j<i; j++) {
		        System.out.print(" ");
		    }
		    for(int j=0; j<n-i+a; j++) {
		        System.out.print("*");
		    }
			System.out.println();
		}

	}

}
