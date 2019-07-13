package 알고리즘_06_24_별찍기_문자열;
import java.util.Scanner;


public class 별찍기1_2438번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
