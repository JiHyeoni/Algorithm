import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        if(B>=C) System.out.println(-1);
        else{
            System.out.println((-A/(B-C))+1);
            //A+B*x=C*x
            //A+(B-C)*x=0
            //x=-A/(B-C)
        }

    }
}