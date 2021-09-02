import java.util.*;

class Point{
	int x,y;
	Point (int x, int y){
		this.x=x;
		this.y=y;
	}
}

class Main {	
	static int n;
	static int [][] board,dis;
	static int [] dx= {-1,1,-1,1,1,-1,0,0};
	static int [] dy= {-1,1,1,-1,0,0,-1,1};
	static int answer;
	static Queue<Point> Q=new LinkedList<>();
	
	public void BFS(int x,int y) {
			Q.offer(new Point(x,y));
			board[x][y]=0;
			while(!Q.isEmpty()) {
				Point tmp=Q.poll();
				for(int i=0;i<8;i++) {
					int nx=tmp.x+dx[i];
					int ny=tmp.y+dy[i];
					if(nx>=0&&nx<n&&ny>=0&&ny<n&&board[nx][ny]==1) {
						board[nx][ny]=0;
						dis[nx][ny]=1;
						Q.offer(new Point(nx,ny));	
					}
				}
			}
	}
	
	public void solution() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==1) {
					BFS(i,j);
					answer++;
				}
			}
		}
	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		n=kb.nextInt();
		board=new int[n][n];
		dis=new int [n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=kb.nextInt();
			}
		}
		
		T.solution();
		
		System.out.print(answer);
		
}
}