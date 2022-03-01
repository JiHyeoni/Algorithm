import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        int count=1;
        while (true){
            st=new StringTokenizer(br.readLine()," ");
            int L=Integer.parseInt(st.nextToken());
            int P=Integer.parseInt(st.nextToken());
            int V=Integer.parseInt(st.nextToken());
            if(L==0&&P==0&&V==0) break;
            int day=0;
            if(V>=P){
                int k=V/P;
                day+=k*L;
                V-=k*P;
            }
            if(V>=L) day+=L;
            else day+=V;

            sb.append("Case ").append(count).append(": ").append(day).append("\n");
            count++;
        }

        System.out.println(sb);
    }
}