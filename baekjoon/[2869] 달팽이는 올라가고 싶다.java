import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String []args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());
        
        int d=(v-a)/(a-b)+1; //������ �ö󰡴°��� ���� �Ϸ絿�� �ö󰡰� �������°����� ���� �� ���������� ������
        if((v-a)%(a-b)!=0) d++; //���������ʴ� �������鵵 �Ϸ縦 �� �ö󰡴°Ŵϱ� +
        System.out.println(d);
        /*
        int d=1;
        int n=0;
        
        while(true){
            n+=a;
            if(n>=v) break;
            n-=b;
            d++;
        }
        System.out.print(d);
        */
    }
}
