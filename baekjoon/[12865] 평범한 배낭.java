import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int [] w=new int[n];
        int [] v=new int[n];
        int [] bag=new int[k+1];
        for(int i=0;i<n;i++){
            w[i]=s.nextInt();
            v[i]=s.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=k;j>=w[i];j--){
                bag[j]=Math.max(bag[j],bag[j-w[i]]+v[i]);
            }
        }

        System.out.println(bag[k]);
    }


}