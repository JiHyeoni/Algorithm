import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    static int min=Integer.MAX_VALUE;
    static int max=Integer.MIN_VALUE;
    static int N;
    static int [] A;
    static String [] B;
    static String [] C;
    static int ch[];

    public static void DFS(int L){
        if(L==N-1){
            int result=A[0];
            for(int i=0;i<N-1;i++){
             if(C[i].equals("+")) result+=A[i+1];
             else if(C[i].equals("-")) result-=A[i+1];
             else if(C[i].equals("*")) result*=A[i+1];
             else if(C[i].equals("/")) result/=A[i+1];
            }
            max=Math.max(result,max);
            min=Math.min(result,min);
        }
        else{
            for(int i=0;i<N-1;i++){
                if(ch[i]==0) {
                    ch[i] = 1;
                    C[L]=B[i];
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        A=new int[N];
        B=new String[N-1];
        C=new String[N-1];
        ch=new int[N-1];
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        int arr1 [] = new int[4];
        String arr2[]={"+","-","*","/"};
        for(int i=0;i<4;i++){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        int j=0;
        for(int i=0;i<4;i++){
            while(arr1[i]!=0){
                B[j]=arr2[i];
                j++;
                arr1[i]--;
            }
        }

        DFS(0);

        System.out.println(max);
        System.out.println(min);

    }
}