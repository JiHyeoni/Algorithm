import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Main{
    static int N;
    static int [][] map;
    static boolean visit[];
    static int min=Integer.MAX_VALUE;
    public static void team(int idx,int count){
        if(N/2==count){
            diff();
            return;
        }

            for(int i=idx;i<N;i++){
                if(!visit[i]){
                    visit[i]=true;
                    team(i+1,count+1);
                    visit[i]=false;
                }

        }
    }

    public static void diff(){
        int team_start=0;
        int team_link=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(visit[i]==true && visit[j]==true){
                    team_start+=map[i][j];
                    team_start+=map[j][i];
                }
                else if(visit[i]==false && visit[j]==false){
                    team_link+=map[i][j];
                    team_link+=map[j][i];
                }
            }
        }

        int val=Math.abs(team_start-team_link);
        if(val==0){
            System.out.println(val);
            System.exit(0);
        }
        min=Math.min(val,min);
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map=new int[N][N];
        visit=new boolean[N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<N;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        team(0,0);
        System.out.println(min);
    }
}