import java.util.*;

class Point{
	int x,y;
	Point (int x, int y){
		this.x=x;
		this.y=y;
	}
}

class Main {	
	static int [][] board,dis;
	static int [] dx= {0,-1,0,1};
	static int [] dy= {-1,0,1,0};
	
	public void BFS(int x,int y) {
		Queue<Point> Q=new LinkedList<>();
		Q.offer(new Point(x,y));
		board[x][y]=1;
		
		while(!Q.isEmpty()) {
			Point tmp=Q.poll();
			
			for(int i=0;i<4;i++) {
				int nx=tmp.x+dx[i];
				int ny=tmp.y+dy[i];
				if(nx>=1&&nx<=7&&ny>=1&&ny<=7&&board[nx][ny]==0) {
					Q.offer(new Point(nx,ny));
					board[nx][ny]=1;
					dis[nx][ny]=dis[tmp.x][tmp.y]+1;
				}
			}
		}
	
	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		dis=new int[8][8];
		board=new int[8][8];
		for(int i=1;i<8;i++) {
			for(int j=1;j<8;j++) {
				board[i][j]=kb.nextInt();
			}
		}

		T.BFS(1,1);
		
		if(dis[7][7]==0) System.out.print(-1);
		else System.out.print(dis[7][7]);
}
}