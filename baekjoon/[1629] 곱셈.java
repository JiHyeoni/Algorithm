import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


class Main {
    static long C;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        long A=Long.parseLong(st.nextToken());
        long B=Long.parseLong(st.nextToken());
        C=Long.parseLong(st.nextToken());
        System.out.println(pow(A,B));
    }

    public static long pow(long A,long ex){
        if(ex==1) return A%C;
        long temp=pow(A,ex/2);

        if(ex%2==1) return (temp*temp%C) * A%C;
        return temp*temp%C;



    }
}
