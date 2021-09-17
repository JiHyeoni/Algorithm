import java.util.*;

class Main {	
	static int [] unf;
	
	public int Find(int v) {
		if(unf[v]==v) return unf[v];
		else return unf[v]=Find(unf[v]);
	}
	public void Union(int a,int b) {
		int fa=Find(a);
		int fb=Find(b);
		if(fa!=fb) unf[fa]=fb;
	}
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
	
		int n=kb.nextInt();
		int m=kb.nextInt();
		unf=new int[n+1];
		for(int i=1;i<=n;i++) unf[i]=i;
		for(int i=0;i<m;i++) {
			int a=kb.nextInt();
			int b=kb.nextInt();
			T.Union(a,b);
		}
		
		int a=kb.nextInt();
		int b=kb.nextInt();
		int fa=T.Find(a);
		int fb=T.Find(b);
		if(fa==fb) System.out.print("YES");
		else System.out.print("NO");
	}
}