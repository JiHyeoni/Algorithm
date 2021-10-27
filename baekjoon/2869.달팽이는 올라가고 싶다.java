import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String []args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());
        
        int d=(v-a)/(a-b)+1; //마지막 올라가는것을 빼고 하루동안 올라가고 내려가는것으로 나눈 뒤 마지막날을 더해줌
        if((v-a)%(a-b)!=0) d++; //떨어지지않는 나머지들도 하루를 더 올라가는거니까 +
        System.out.println(d);
        /*
        int d=1;
        int n=0;
        
        while(true){
            n+=a;
            if(n>=v) break;
            n-=b;
            d++;
        }
        System.out.print(d);
        */
    }
}
