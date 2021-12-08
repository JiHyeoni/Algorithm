import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main{
    static int [] stair;
    static int [] arr;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        arr=new int[n+1];
        stair=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        Arrays.fill(stair,-1);

        stair[0]=arr[0];
        stair[1]=arr[1];
        if(n>=2){
            stair[2]=arr[1]+arr[2];
        }
        System.out.println(find(n));
    }

    public static int find(int n){
        if(stair[n]==-1){
            stair[n]=Math.max(find(n-3)+arr[n-1],find(n-2))+arr[n];
        }
        return stair[n];
    }
}
