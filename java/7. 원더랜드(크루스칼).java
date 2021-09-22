import java.util.*;

class Edge implements Comparable<Edge>{
	int v1;
	int v2;
	int cost;
	Edge(int v1,int v2,int cost){
		this.v1=v1;
		this.v2=v2;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Edge o) {
		return this.cost-o.cost;
	}
}

class Main {	
	static int[] unf;
	public static int Find(int v) {
		if(unf[v]==v) return unf[v];
		else return unf[v]=Find(unf[v]);
	}
	
	public static void Union(int a,int b) {
		int fa=Find(a);
		int fb=Find(b);
		if(fa!=fb) unf[fa]=fb;
	}
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		ArrayList<Edge> graph=new ArrayList<>();
		int answer=0;
		unf=new int[n+1];
		
		for(int i=1;i<=n;i++) unf[i]=i;
		
		for(int i=0;i<m;i++) {
			int v1=kb.nextInt();
			int v2=kb.nextInt();
			int cost=kb.nextInt();
			graph.add(new Edge(v1,v2,cost));
		}
		
		Collections.sort(graph);
		
		for(Edge ob:graph) {
			int fv1=Find(ob.v1);
			int fv2=Find(ob.v2);
			if(fv1!=fv2) {
				Union(ob.v1,ob.v2);
				answer+=ob.cost;
			}
		}
		
		System.out.print(answer);

		
	}
}