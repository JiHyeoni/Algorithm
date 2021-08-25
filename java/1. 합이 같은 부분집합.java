import java.util.*;

class Main {
	static int n;
	static int [] arr;
	static int total;
	static boolean flag=false;
	static String answer="NO";

	public void DFS(int L,int sum) {
		if(flag) return;
		if(sum>(total/2)) return;
		if(L==n) {
			if(sum==(total-sum)) {
				flag=true;
				answer="YES";
			}
		}
		else {
			DFS(L+1,sum);
			DFS(L+1,sum+arr[L]);
		}

	}
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		n=kb.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
			total+=arr[i];
		}
		
		T.DFS(0,0);
		
		System.out.println(answer);
		
}
}