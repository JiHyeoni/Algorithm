import java.util.*;

class Edge implements Comparable<Edge>{
	int vex;
	int cost;
	Edge(int vex,int cost){
		this.vex=vex;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Edge ob) {
		return this.cost-ob.cost;
	}
}

class Main {	
	static int n,m;
	static int [] dis;
	static ArrayList<ArrayList<Edge>> graph;

	public void solution(int v) {
		PriorityQueue<Edge> pQ=new PriorityQueue<>();
		dis[v]=0;
		pQ.offer(new Edge(v,0));
		
		while(!pQ.isEmpty()) {
			Edge tmp=pQ.poll();
			int now=tmp.vex;
			int nowCost=tmp.cost;
			if(dis[now]<nowCost) continue;
			for(Edge o:graph.get(now)) {
				if(dis[o.vex]>nowCost+o.cost) {
					dis[o.vex]=nowCost+o.cost;
					pQ.offer(new Edge(o.vex,nowCost+o.cost));
				}
			}
		}
	}

	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		n=kb.nextInt();
		m=kb.nextInt();
		dis=new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		graph=new ArrayList<ArrayList<Edge>>();
		
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Edge>());
		}
		
		for(int i=0;i<m;i++) {
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			
			graph.get(a).add(new Edge(b,c));
		}
		
		T.solution(1);
		
		for(int i=2;i<=n;i++) {
			if(dis[i]==Integer.MAX_VALUE) System.out.println(i+" : impossible");
			else System.out.println(i+" : "+dis[i]);
		}
	}
}