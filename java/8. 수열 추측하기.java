import java.util.*;



class Main {	
	static int n,f;
	static int [] ch,p,b;
	static int [][] dy=new int [11][11];
	static boolean flag= false;
	
	public int combi(int n,int r) {
		if(n==r||r==0) return 1;
		if(dy[n][r]!=0) return dy[n][r];
		else return dy[n][r]=combi(n-1,r-1)+combi(n-1,r);
	}
	
	public void DFS(int L, int sum) {
	
		if(flag) return;
		if(L==n) {
			if(sum==f) {
				for(int x : p) System.out.print(x+" ");
				flag=true;
			}
		}
		else {
			for(int i=1;i<=n;i++) {
				if(ch[i]==0) {
					ch[i]=1;
					p[L]=i;
					DFS(L+1,sum+p[L]*b[L]);
					ch[i]=0;
				}
			}
		}
	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		n=kb.nextInt();
		f=kb.nextInt();
		ch=new int [n+1];
		p=new int [n];
		b=new int[n];
		
		for(int i=0;i<n;i++) {
			b[i]=T.combi(n-1, i);
		}
		
		T.DFS(0, 0);

}
}