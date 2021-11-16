import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        String [][] arr=new String[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=" ";
            }
        }

        star(arr,0,0,n);

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
    public static void star(String[][]arr,int x,int y,int n){
        if(n==1){
            arr[x][y]="*";
            return;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(!(i==1&&j==1))
                    star(arr,x+i*(n/3),y+j*(n/3),n/3);
            }
        }
    }
}