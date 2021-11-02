import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int h=s.nextInt();
            int w=s.nextInt();
            int n=s.nextInt();
            int floor=n%h;
            int room=(n/h)+1;
            System.out.println(floor*100+room);
        }
    }
}