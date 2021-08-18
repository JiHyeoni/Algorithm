import java.util.*;

class Main {
	int [] dis= {-1,1,5};
	int [] ch;
	public int BFS(int s, int e){
		Queue <Integer> Q = new LinkedList<>();
		ch=new int[10001];
		int L=0;
		Q.offer(s);
		ch[s]=1;
		while(!Q.isEmpty()) {
			int len=Q.size();
			for(int i=0;i<len;i++) {
				int x=Q.poll();
				for(int j=0;j<3;j++) {
					int nx=x+dis[j];
					if(nx==e) return L+1;
					if(nx>=1 && nx<=10000 && ch[nx]==0) {
						ch[nx]=1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
		}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		int s=kb.nextInt();
		int e=kb.nextInt();
		System.out.println(T.BFS(s,e));
	}
}
