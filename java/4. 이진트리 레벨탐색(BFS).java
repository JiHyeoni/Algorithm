import java.util.*;

class Node{
	int data;
	Node lt,rt;
	
	public Node(int val) {
		this.data=val;
		lt=rt=null;
	}
	
}


class Main {
	Node root;
	public void BFS(Node root) {
		Queue<Node> Q=new LinkedList<>();
		int L=0;
		Q.offer(root);
		while(!Q.isEmpty()) {
			int len=Q.size();
			System.out.print(L+" : ");
			for(int i=0;i<len;i++) {
				Node cur=Q.poll();
				System.out.print(cur.data+" ");
				if(cur.lt!=null) Q.offer(cur.lt);
				if(cur.rt!=null) Q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
		return;
	}

	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		T.root=new Node(1);
		T.root.lt=new Node(2);
		T.root.rt=new Node(3);
		T.root.lt.lt=new Node(4);
		T.root.lt.rt=new Node(5);
		T.root.rt.lt=new Node(6);
		T.root.rt.rt=new Node(7);
		
		T.BFS(T.root);
	}
}
