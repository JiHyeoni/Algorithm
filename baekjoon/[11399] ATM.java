import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] time=new int[n];
        for(int i=0;i<n;i++){
            time[i]=s.nextInt();
        }

        Arrays.sort(time);

        int sum=0;
        int k=n;
        for(int i=0;i<n;i++){
            sum+=time[i]*k;
            k--;
        }

        System.out.println(sum);
    }
}