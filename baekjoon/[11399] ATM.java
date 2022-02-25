import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    public static void main(String [] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int p[]=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            p[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(p);

        int sum=0;
        int k=n;
        for(int i=0;i<n;i++){
            sum+=p[i]*k;
            k--;
        }
        System.out.println(sum);

    }
}
