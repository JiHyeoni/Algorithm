import java.util.*;


class Main {	
	
	public void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n-1);
			System.out.print(n+" ");
		}
	}
		

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int n=kb.nextInt();
		T.DFS(3);

	}
}
