import java.util.*;

class Edge implements Comparable<Edge>{
	int v;
	int cost;
	Edge(int v,int cost){
		this.v=v;
		this.cost=cost;
	}
	@Override
	public int compareTo(Edge o) {
		return this.cost-o.cost;
	}
}


class Main {

	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		ArrayList<ArrayList<Edge>> arr=new ArrayList<ArrayList<Edge>>();
		for(int i=0;i<=n;i++) {
			arr.add(new ArrayList<Edge>());
		}
		
		for(int i=0;i<m;i++) {
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			arr.get(a).add(new Edge(b,c));
			arr.get(b).add(new Edge(a,c));
		}
		
		int answer=0;
		int[] ch=new int[n+1];
		PriorityQueue<Edge> pQ=new PriorityQueue<>();
		pQ.offer(new Edge(1,0));
		while(!pQ.isEmpty()) {
			Edge tmp=pQ.poll();
			int now=tmp.v;
			if(ch[now]==0) {
				ch[now]=1;
				answer+=tmp.cost;
				for(Edge ob:arr.get(now)) {
					if(ch[ob.v]==0) pQ.offer(new Edge(ob.v,ob.cost));
				}
			}
		}

		System.out.println(answer);
	}
}