package �˰���_06_24_�����_���ڿ�;
import java.util.Scanner;

public class �����3_2440�� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
