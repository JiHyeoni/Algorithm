import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    static int arr[];
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        arr=new int[N+1];
        System.out.println(find(N));
    }

    public static int find(int N){
        if(N<3) return N;
        arr[1]=1;
        arr[2]=2;
        if(arr[N]!=0) return arr[N];
        else{
            return arr[N]=(find(N-1)+find(N-2))%15746;
        }
    }
}