import java.util.*;

class Point implements Comparable<Point>{
	int vex;
	int cost;
	Point(int vex,int cost){
		this.vex=vex;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Point o) {
		return this.cost-o.cost;
	}
}

class Main {	
	static int n,m;
	static int [] dis;
	static ArrayList<ArrayList<Point>> graph;
	public void solution(int v) {
		PriorityQueue<Point> pQ=new PriorityQueue<>();
		pQ.add(new Point(v,0));
		dis[v]=0;
		
		while(!pQ.isEmpty()) {
			Point tmp=pQ.poll();
			int now=tmp.vex;
			int nowCost=tmp.cost;
			if(dis[now]<nowCost) continue;
			for(Point ob:graph.get(now)) {
				if(dis[ob.vex]>nowCost+ob.cost) {
					dis[ob.vex]=nowCost+ob.cost;
					pQ.add(new Point(ob.vex,nowCost+ob.cost));
				}
			}
		}
		
		for(int i=2;i<=n;i++) {
			if(dis[i]==Integer.MAX_VALUE) System.out.println(i+" : impossible");
			else System.out.println(i+" : " + dis[i]);
		}

	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		n=kb.nextInt();
		m=kb.nextInt();
		graph=new ArrayList<ArrayList<Point>>();
		dis=new int[n+1];
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0;i<m;i++) {
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			graph.get(a).add(new Point(b,c));
		}
		
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		T.solution(1);
		
	}
}