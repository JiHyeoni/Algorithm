import java.util.*;


class Main {	
	static int n;
	static int[]ch;
	public void DFS(int L) {
		
		if(L==n+1) {
			String tmp=" ";
			for(int i=1;i<n+1;i++) {
				if(ch[i]==1) tmp+=(i+" ");
			}
			if(tmp.length()>0) System.out.println(tmp);
			
		}
		else {
			ch[L]=1;
			DFS(L+1);
			ch[L]=0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		n=kb.nextInt();
		ch=new int[n+1];
		
		T.DFS(1);
	}
}
