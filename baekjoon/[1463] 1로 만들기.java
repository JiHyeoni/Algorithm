import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    static int min=Integer.MAX_VALUE;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        find(N,0);
        System.out.print(min);
    }
    public static void find(int n,int count){
        if(count>=min) return;
        if(n==1) {
            min=Math.min(count,min);
            //System.out.println(1);
            return;
        }
        else{
            if(n%3==0) {
                //System.out.println(n+"/3 "+(count+1));
                find(n/3,count+1);
            }
            if(n%2==0) {
                //System.out.println(n+"/2 "+(count+1));
                find(n/2,count+1);
            }
            //System.out.println(n+"-1 "+(count+1));
            find(n-1,count+1);
        }
    }
}