import java.util.*;

class Main {	
	static int n,m;
	static int [] p;
	
	public void DFS(int L, int s) {
		if(L==m) {
			for(int x:p) System.out.print(x+" ");
			System.out.println();
		}
		else {
			for(int i=s;i<=n;i++) {
				p[L]=i;
				DFS(L+1,i+1);
			}
		}
	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		p=new int[m];
		
		T.DFS(0,1);

}
}