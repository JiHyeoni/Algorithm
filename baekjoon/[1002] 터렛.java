import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        for(int i=0;i<t;i++){
            int x1=s.nextInt();
            int y1=s.nextInt();
            int r1=s.nextInt();

            int x2=s.nextInt();
            int y2=s.nextInt();
            int r2=s.nextInt();

            int d=(int)(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

            if(x1==x2&&y1==y2&&r1==r2){
                System.out.println("-1");
            }
            else if(Math.pow(r2-r1,2)==d||d==Math.pow(r1+r2,2)){
                System.out.println("1");
            }
            else if(Math.pow(r2-r1,2)>d||d>Math.pow(r1+r2,2)){
                System.out.println("0");
            }
            else{
                System.out.println("2");
            }
            /*
             else if(Math.pow(r2-r1,2)<d&&d<Math.pow(r1+r2,2)){
                System.out.println("2");
            }
            * */

        }
    }
}