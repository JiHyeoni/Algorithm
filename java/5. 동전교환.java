import java.util.*;

class Main {
	static int n,m;
	static Integer [] coin;
	static int min=Integer.MAX_VALUE;
	
	public void DFS(int L,int sum) {
		if(L>min) return;
		if(sum>m) return;
		if(sum==m) min=Math.min(L, min);
		else {
			for(int i=0;i<n;i++) {
				DFS(L+1,sum+coin[i]);
			}
		}
		
	}
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		n=kb.nextInt();
		coin=new Integer[n];
		for(int i=0;i<n;i++) {
			coin[i]=kb.nextInt();
		}
		m=kb.nextInt();
		Arrays.sort(coin,Collections.reverseOrder());

		T.DFS(0,0);
		System.out.print(min);
		
}
}