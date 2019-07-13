package 알고리즘_06_24_별찍기_문자열;
import java.util.Scanner;

public class 별찍기5_2442번 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n+i; j++) {
				if(j<n-i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}