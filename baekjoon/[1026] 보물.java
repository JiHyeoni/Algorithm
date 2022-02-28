import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int [] A=new int[n];
        int [] B=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }

        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            B[i]=Integer.parseInt(st.nextToken());
        }

        /*
        Arrays.sort(A);
        Arrays.sort(B);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=A[i]*B[n-i-1];
        }
        System.out.println(sum);
        */

        int [] count=new int[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(B[i]==B[j]&&j>i){
                    //같을 때 count 수가 겹치지 않게 하기 위해서
                    count[i]+=1;
                }
                else if(i!=j&&B[i]<B[j]){
                    count[i]+=1;
                }
            }
        }

        Arrays.sort(A);

        int [] C=new int[n];
        for(int i=0;i<n;i++){
            C[i]=A[count[i]];
        }

        int sum=0;

        for(int i=0;i<n;i++){
            sum+=C[i]*B[i];
        }

        System.out.println(sum);

    }
}