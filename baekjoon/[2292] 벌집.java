import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        int room=1;
        int i=1;
        while(true){
            if(room>=n) break;
            room=room+i*6;
            i++;
        }

        System.out.println(i);

    }
}