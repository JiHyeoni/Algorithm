import java.util.*;

class Main {	

	int [] dx= {-1,0,1,0};
	int [] dy= {0,-1,0,1};
	static int[][] dis;
	static int answer;
	public void DFS(int x, int y) {
		if(x==6 && y==6) answer++;
		else {
			for(int i=0;i<4;i++) {
				if(x+dx[i]>=0&&y+dy[i]>=0&&x+dx[i]<7&&y+dy[i]<7&&dis[x+dx[i]][y+dy[i]]==0) {
					dis[x+dx[i]][y+dy[i]]=1;
					DFS(x+dx[i],y+dy[i]);
					dis[x+dx[i]][y+dy[i]]=0;
				}
			}
		}

	}
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		dis=new int[7][7];
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				dis[i][j]=kb.nextInt();
			}
		}
		dis[0][0]=1;
		T.DFS(0,0);
		
		System.out.print(answer);
		
}
}