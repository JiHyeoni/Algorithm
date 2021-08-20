import java.util.*;

class Main {
	static int max=Integer.MIN_VALUE;
	static int n;
	static int m;
	static int [] score;
	static int [] time;
	
	public void DFS(int L,int s_sum,int t_sum) {
		
		if(t_sum>m) return;
		if(L==n) {
			max=Math.max(max, s_sum);
		}
		else {
			DFS(L+1,s_sum+score[L],t_sum+time[L]);
			DFS(L+1,s_sum,t_sum);
		}

	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		n=kb.nextInt();
		m=kb.nextInt();
		score=new int[n];
		time=new int[n];
		for(int i=0;i<n;i++) {
			score[i]=kb.nextInt();
			time[i]=kb.nextInt();
		}
		
		T.DFS(0,0,0);
		System.out.print(max);
}
}