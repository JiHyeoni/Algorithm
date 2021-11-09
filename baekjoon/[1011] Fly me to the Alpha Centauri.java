import java.util.*;

class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        for(int i=0;i<t;i++){
            int x=s.nextInt();
            int y=s.nextInt();

            int dis=y-x;
            int cnt=0;
            int max=(int)Math.sqrt(dis);

            if(max==Math.sqrt(dis)) cnt=max*2-1;
            else if(dis<=max*max+max) cnt=2*max;
            else cnt=2*max+1;

            System.out.println(cnt);
        }
    }
}