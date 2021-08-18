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
	public int DFS(int L, Node root) {
		if(root.lt==null && root.rt==null) return L;
		else {
			return Math.min(DFS(L+1,root.lt), DFS(L+1,root.rt));
		}
	}
		

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		T.root=new Node(1);
		T.root.lt=new Node(2);
		T.root.rt=new Node(3);
		T.root.lt.lt=new Node(4);
		T.root.lt.rt=new Node(5);
		
		System.out.println(T.DFS(0, T.root));
	}
}
