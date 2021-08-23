import java.util.*;

class Main {
	static int n,m;
	static int [] dis;
	
	public void DFS(int L) {
		if(L==m) {
			for(int i=0;i<m;i++) {
				System.out.print(dis[i]+" ");
			}
			System.out.println();
		}
		else {
			for(int i=1;i<=n;i++) {
				dis[L]=i;
				DFS(L+1);
			}
		}

	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		dis=new int[m];
		
		T.DFS(0);
		
}
}