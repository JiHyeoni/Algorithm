import java.util.*;

class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str=s.next();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=str.charAt(i)-48;
        }
        System.out.print(sum);
    }
}