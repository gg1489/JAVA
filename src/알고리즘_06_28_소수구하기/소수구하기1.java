package �˰���_06_28_�Ҽ����ϱ�;
import java.util.Scanner;
public class �Ҽ����ϱ�1 {
	public static void main(String[] args) {	// �����佺�׳׽� ü ��� ���
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
