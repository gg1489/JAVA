package �˰���_06_24_�����_���ڿ�;
import java.util.Scanner;

public class �����2_2439�� {

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
