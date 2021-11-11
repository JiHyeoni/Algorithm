import java.util.*;

class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int w=s.nextInt();
        int h=s.nextInt();

        int min=Integer.MAX_VALUE;

        if(min>w-x) min=w-x;
        if(min>x) min=x;
        if(min>h-y) min=h-y;
        if(min>y) min=y;

        System.out.println(min);
    }
}