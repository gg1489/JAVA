package 알고리즘_06_28_소수구하기;
import java.util.Scanner;
public class 소수구하기1 {
	public static void main(String[] args) {	// 에라토스테네스 체 방법 사용
		int a,b;
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		int n[] = new int[b + 1];
		
		for(int i=0; i<=b; i++) n[i]=0;
		n[1]=1;
		
		for(int i=2; i<=b; i++)
			for(int j=2; i*j<=b; j++)
				n[i*j]=1;
		
		for(int i=a; i<=b; i++) if(n[i]!=1) System.out.println(i);
	} 
}
