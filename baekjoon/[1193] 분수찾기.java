import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();

        int i=1;
        int room=1;
        while(true){
            if(room>x) break;
            room+=i;
            i++;
        }
        //System.out.println(x-(room-(i)));
        //System.out.println(i-1);

        int p1=x-(room-(i)); // 해당 줄에서 몇번째 위치?
        int p2=i-1; // 몇번째 줄?

        if((i-1)%2==0) System.out.println(p1 +"/" + ((p2-p1)+1));
        else if((i-1)%2==1) System.out.println((p2-p1)+1 + "/" +p1);

    }
}