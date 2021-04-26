import java.util.*;

public class Main {
	
	public boolean isPrime(int a) {
		
		if (a==1) return false;
		
		for(int i=2;i<a;i++) {
			if(a%i==0) return false;
		}
		
		return true;
		
	}


	public ArrayList<Integer> solution( int n,int[] arr) {
		ArrayList<Integer> answer=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int tmp=arr[i];
			int a=0;
			while(tmp>0) {
				a=10*a+tmp%10;
				tmp=tmp/10;
			}
			if(isPrime(a)) answer.add(a);
		}
				
		return answer;
	}
	
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		for(int x:T.solution(n,arr)) {
			System.out.print(x+" ");
		}
}
}
	

