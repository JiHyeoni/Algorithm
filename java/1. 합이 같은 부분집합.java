import java.util.*;



class Main {
	static String answer="NO";
	boolean flag=false;
	static int n;
	static int [] arr; 
	static int total;
	
	public void DFS(int L,int sum) {
		if(flag) return;
		if(sum>(total/2)) return;
		if(L==n) {
			if(sum==(total-sum)) {
				answer="YES";
				flag=true;
			}
		}
		else {
			DFS(L+1,sum+arr[L]);
			DFS(L+1,sum);
		}
	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		n=kb.nextInt();
		arr=new int[n];
		total=0;
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
			total+=arr[i];
		}
		
		T.DFS(0, 0);
		System.out.print(answer);
}
}