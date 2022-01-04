import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int front=1;
        int back=0;
        int [] queue=new int[2000000];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            String str=st.nextToken();
            if(str.equals("push")){
                int num=Integer.parseInt(st.nextToken());
                back++;
                queue[back]=num;
            }
            else if(str.equals("pop")){
                if(back-front+1==0) sb.append(-1).append("\n");
                else {
                    sb.append(queue[front]).append("\n");
                    front++;
                }
            }
            else if(str.equals("size")){
                sb.append(back-front+1).append("\n");
            }
            else if(str.equals("empty")){
                if(back-front+1==0) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if(str.equals("front")){
                if(back-front+1==0) sb.append(-1).append("\n");
                else sb.append(queue[front]).append("\n");
            }

            else if(str.equals("back")){
                if(back-front+1==0) sb.append(-1).append("\n");
                else sb.append(queue[back]).append("\n");
            }

        }

        System.out.println(sb);
    }
}

