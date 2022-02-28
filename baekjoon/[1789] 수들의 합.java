import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long s=Long.parseLong(br.readLine());
        long num=0l;
        int n=0;

        for(int i=1;i<=s;i++){
            if(num>s) break;
            num+=i;
            n++;
        }

        System.out.println(n-1);
    }

}