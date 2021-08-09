import java.util.*;

class Node{
	int data;
	Node lt,rt;
	public Node(int val){
		this.data=val;
		lt=rt=null;
	}
}

class Main {
	Node root;
	
	public int BFS(Node root) {
		Queue<Node> Q=new LinkedList<>();
		int L=0;
		Q.offer(root);
		
		while(!Q.isEmpty()) {
			int len=Q.size();
			for(int i=0;i<len;i++) {
				Node cur=Q.poll();
				if(cur.lt==null && cur.rt==null) return L;
				if(cur.lt!=null) Q.offer(cur.lt);
				if(cur.rt!=null) Q.offer(cur.rt);
			}
			L++;
		}
		return 0;
	}

	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		T.root=new Node(1);
		T.root.lt=new Node(2);
		T.root.rt=new Node(3);
		T.root.lt.lt=new Node(4);
		T.root.lt.rt=new Node(5);

		System.out.print(T.BFS(T.root));
	}
}
