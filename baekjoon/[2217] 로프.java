import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int [] rope=new int[n];
        for(int i=0;i<n;i++){
            rope[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope);
        int maxWeight=Integer.MIN_VALUE;
        int count=n;

        for(int i=0;i<n;i++){
            maxWeight=Math.max(maxWeight,rope[i]*count);
            count--;
        }

        System.out.println(maxWeight);
    }
}