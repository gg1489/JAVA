package �˰���_06_24_�����_���ڿ�;
import java.util.Scanner;


public class �����1_2438�� {

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
