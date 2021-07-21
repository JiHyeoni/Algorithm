import java.util.*;


class Main {	
	
	public int DFS(int n) {
		if(n==1) return 1;
		else {
			return n*DFS(n-1);
		}
	}
		
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		System.out.println(T.DFS(n));

	}
}
