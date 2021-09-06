import java.util.*;


class Main {	
	
	static int n;
	static int[][] arr;
	static int answer;
	static int [] dx= {-1,1,-1,1,0,1,0,-1};
	static int [] dy= {-1,1,1,-1,-1,0,1,0};
	
	public void DFS(int x,int y) {
		for(int i=0;i<8;i++) {
			int nx=dx[i]+x;
			int ny=dy[i]+y;
			if(nx>=0&&nx<n&&ny>=0&&ny<n&&arr[nx][ny]==1) {
				arr[nx][ny]=0;
				DFS(nx,ny);
			}
		}
	}
	
	public void solution() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==1) {
					arr[i][j]=0;
					answer++;
					DFS(i,j);
				}
			}
		}
	}
	

	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		n=kb.nextInt();
		arr=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		
		T.solution();
		
		System.out.print(answer);
		
}
}