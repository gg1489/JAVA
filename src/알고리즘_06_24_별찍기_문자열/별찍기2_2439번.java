package 알고리즘_06_24_별찍기_문자열;
import java.util.Scanner;

public class 별찍기2_2439번 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for (int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(j<num-i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
