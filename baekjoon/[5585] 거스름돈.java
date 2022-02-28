import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int price=Integer.parseInt(br.readLine());
        int [] money={500,100,50,10,5,1};
        int change=1000-price;
        int count=0;
        for(int i=0;i<money.length;i++){
            while(money[i]<=change){
                change-=money[i];
                count++;
            }
        }
        System.out.println(count);

    }
}
