import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int k=0;

        while(true){
            if(n%5==0){
                k+=n/5;
                System.out.println(k);
                break;
            }
            else if(n<0){
                System.out.println(-1);
                break;
            }
            else{
                n-=3;
                k++;
            }

        }
    }
}