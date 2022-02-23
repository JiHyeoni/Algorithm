import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Main{
    static ArrayList<Integer>[] list;
    static int [] check;
    static int [] parents;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        list=new ArrayList[n];
        check=new int[n];
        parents=new int[n];
        for(int i=0;i<n;i++){
            list[i]=new ArrayList<>();
        }
        StringTokenizer st;
        for(int i=0;i<n-1;i++){
            st=new StringTokenizer(br.readLine()," ");
            int v1=Integer.parseInt(st.nextToken());
            int v2=Integer.parseInt(st.nextToken());
            list[v1-1].add(v2-1);
            list[v2-1].add(v1-1);
        }

        dfs(0);

        StringBuilder sb=new StringBuilder();
        for(int i=1;i<n;i++){
            sb.append(parents[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int v){
        check[v]=1;
        for (int num : list[v]) {
            if(check[num]==0){
                parents[num]=v+1;
                dfs(num);
            }
        }
    }
}