import java.util.*;

class Point{
	int x,y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}

class Main {	
	static int m,n;
	static int[][] board, dis;
	static int[] dx={0,-1,0,1};
	static int[] dy= {-1,0,1,0};
	static int answer;
	static Queue<Point> Q=new LinkedList<>();
	
	public void BFS() {
		while(!Q.isEmpty()) {
			Point tmp=Q.poll();
			for(int i=0;i<4;i++) {
				int nx=tmp.x+dx[i];
				int ny=tmp.y+dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<m && dis[nx][ny]==0) {
					board[nx][ny]=1;
					Q.offer(new Point(nx,ny));
					dis[nx][ny]=dis[tmp.x][tmp.y]+1;
				}
			}
		}		
	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		m=kb.nextInt();
		n=kb.nextInt();
		board=new int[n][m];
		dis=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				board[i][j]=kb.nextInt();
				if(board[i][j]==1) Q.offer(new Point(i,j));
			}
		}
		T.BFS();
		boolean flag=true;
		int answer=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(board[i][j]==0) flag=false;
			}
		}
		
		if(flag) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					answer=Math.max(answer, dis[i][j]);
				}
			}
			System.out.print(answer);
		}

		else System.out.print(-1);
}
}