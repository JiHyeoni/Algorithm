import java.util.*;

class Main {
	static int n;
	static int m;
	static int min=Integer.MAX_VALUE;
	public void DFS(int L,int sum,Integer[]coin) {
		if(sum>m) return;
		if(L>=min) return;
		if(sum==m) min=Math.min(min,L);
		else {
			for(int i=0;i<n;i++) {
				DFS(L+1,sum+coin[i],coin);
			}
		}
	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		n=kb.nextInt();
		Integer [] coin=new Integer[n];
		for(int i=0;i<n;i++) {
			coin[i]=kb.nextInt();
		}
		Arrays.sort(coin, Collections.reverseOrder());
		m=kb.nextInt();
		
		T.DFS(0,0,coin);
		System.out.print(min);
		
}
}