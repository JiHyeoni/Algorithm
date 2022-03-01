import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Integer [] alphabet=new Integer[26];
        Arrays.fill(alphabet,0);
        for(int i=0;i<n;i++){
            char [] ch=br.readLine().toCharArray();
            int pos=1;
            for(int j=ch.length-1;j>=0;j--){
                alphabet[ch[j]-'A']+=pos;
                pos*=10;
            }
        }

        Arrays.sort(alphabet, Collections.reverseOrder());
        int answer=0;
        int value=9;
        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i]==0) break;
            answer+=alphabet[i]*value;
            value--;
        }

        System.out.println(answer);
    }
}