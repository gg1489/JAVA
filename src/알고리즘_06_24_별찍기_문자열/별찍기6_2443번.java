package �˰���_06_24_�����_���ڿ�;
import java.util.Scanner;

public class �����6_2443�� {

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
