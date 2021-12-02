import java.util.*;

class Main{
    static int arr[];
    static int count=0;
    static int N;
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        arr=new int[N];
        DFS(0);
        System.out.println(count);
    }
    public static void DFS(int L){
        if(L==N){
            count++;
            return;
        }
        for(int i=0;i<N;i++){
            arr[L]=i;
            //L은 열, i는 행
            if(nQueen(L)){
                DFS(L+1);
            }
        }
    }

    static public boolean nQueen(int col){
        for(int i=0;i<col;i++){
            if(arr[i]==arr[col]) return false;
            else if(Math.abs(col-i)==Math.abs(arr[i]-arr[col])) return false;
        }
        return true;
    }
}