import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=s.nextInt();
            arr[i][1]=s.nextInt();
        }

        for(int i=0;i<n;i++){
            int rank=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) rank++;
                }
            }
            System.out.print(rank+" ");
        }
    }
}