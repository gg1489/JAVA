package �˰���_06_28_�Ҽ����ϱ�;

import java.util.Scanner;

public class �Ҽ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int sum=0;
		int min=0;
		
		for(int i=m; i>=n; i--) {
			for(int j=2; j<i; j++) {
				if(i%j==0 && i!=j) {
					break;
				}
				if(i==j+1 || i==2) {
					sum += i;
					min = i;
				}
			}
		}
		if(sum==0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
