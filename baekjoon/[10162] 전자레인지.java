import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(br.readLine());

        int [] time={300,60,10};
        int [] count=new int[3];

        boolean check=true;
        for(int i=0;i<3;i++){
            while(T>=time[i]){
                count[i]++;
                T-=time[i];
            }
        }

        if(T!=0)check=false;

        if(check){
            for(int cnt:count){
                System.out.print(cnt+" ");
            }
        }
        else System.out.print(-1);

    }
}