package �˰���_06_24_�����_���ڿ�;
import java.util.Scanner;

public class �����7_2444�� {

	public static void main(String[] args) {
		 int line;
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("How long is the line?(only odd-number) : ");
	        line = input.nextInt();
	            
	        for(int i=line/2, add=0; i>0; i--, add++) {
	            for(int j=0; j<=i-1; j++) {
	                System.out.print(" ");
	            }
	            for(int j=0; j<line/2 - (i-1)+add; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        for(int i=0, add=line/2; i<line/2 + 1; i++, add--) {
	            for(int j=0; j<i; j++) {
	                System.out.print(" ");   
	            }
	            for(int j=0; j<(line/2 + 1)-i+add; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	}

}
