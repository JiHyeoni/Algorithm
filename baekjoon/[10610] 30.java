import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int number[]=new int[10];
        int total=0;
        for(int i=0;i<str.length();i++){
            number[str.charAt(i)-'0']++;
            total+=str.charAt(i)-'0';
        }

        StringBuilder sb=new StringBuilder();
        if(number[0]==0||total%3!=0){
            sb.append(-1).append("\n");
        }
        else {
            for(int i=9;i>=0;i--){
                while(number[i]!=0){
                    sb.append(i);
                    number[i]--;
                }
            }
        }
        System.out.println(sb);
    }
}