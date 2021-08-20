import java.util.*;

class Main {
	static int [] dis;
	public void DFS(int n, int m, int L) {
		if(L==m) 
		{
			for(int x:dis) System.out.print(x+" ");
			System.out.println();
		}
		else {
			for(int i=1;i<=n;i++) {
				dis[L]=i;
				DFS(n,m,L+1);
			}
		}
		
	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		int n=kb.nextInt();
		int m=kb.nextInt();
		dis=new int[m];

		
		T.DFS(n,m,0);
}
}