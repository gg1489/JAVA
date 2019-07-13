package �˰���_06_28_�Ҽ����ϱ�;
import java.util.*;

public class �Ҽ����ϱ�2 {
	public static void main(String[] args) { // �׳� �Ҽ��� ������
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		
		int[] arr = new int[n+1];
		arr[0] = arr[1] = 1;
		
		for(int a:getprime(n)) {
			for(int i=a+a; i<=n; i+=a) {
				arr[i] = 1;
			}
		}
		for(int i=m; i<=n; i++) {
			if(arr[i]==0)
				System.out.println(i);
		}

	}
	
	static ArrayList<Integer> getprime(int n){
		        int max = (int) Math.sqrt(n);
		        ArrayList<Integer> prime = new ArrayList<Integer>();
		        for(int i=2;i<=max;i++){
		            boolean flag = true;
		            for(int a=0;a<prime.size();a++){
		               if(i%prime.get(a)==0){
		                    flag = false;
		                    break;
		                }
		           }
		            if(flag == true){
		                prime.add(i);
		            }
		        }
		        return prime;
		    }
}
