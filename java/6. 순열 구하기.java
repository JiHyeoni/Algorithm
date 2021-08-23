import java.util.*;

class Main {
	static int n,m;
	static int [] arr;
	static int [] dis;
	static int[] ch;
	
	public void DFS(int L) {
		if(L==m) {
			for(int nx:dis) {
				System.out.print(nx+" ");
			}
			System.out.println();
		}
		else {
			for(int i=0;i<n;i++) {
				if(ch[i]==0) {
					ch[i]=1;
					dis[L]=arr[i];
					DFS(L+1);
					ch[i]=0;
				}
			}
			
		}
	}
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		arr=new int [n];
		ch=new int[n];
		dis=new int[m];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		
		T.DFS(0);
}
}