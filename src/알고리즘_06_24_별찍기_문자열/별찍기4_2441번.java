package 알고리즘_06_24_별찍기_문자열;
import java.util.Scanner;

public class 별찍기4_2441번 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
