import java.util.*;

class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int [] left=new int [1001];
        int [] right=new int[1001];
        for(int i=0;i<3;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            left[x]+=1;
            right[y]+=1;
        }
        int a=0,b=0;
        for(int i=0;i<=1000;i++){
            if(left[i]==1) a=i;
            if(right[i]==1) b=i;
        }

        System.out.println(a+" "+b);
    }
}