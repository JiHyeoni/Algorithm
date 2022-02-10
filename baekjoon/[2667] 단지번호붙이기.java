import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    static int [][] arr;
    static int [][] check;
    static int [] house;
    static int houseCount;
    static int count=0;
    static int [] x={-1,0,1,0};
    static int [] y={0,-1,0,1};

    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        arr=new int[n][n];
        check=new int[n][n];
        ArrayList<Integer> house=new ArrayList<>();
        for(int i=0;i<n;i++){
            String str=br.readLine();
            for(int j=0;j<n;j++){
                arr[i][j]=str.charAt(j)-'0';
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(check[i][j]==0&&arr[i][j]==1){
                    count++;
                    houseCount=0;
                    dfs(i,j);
                    house.add(houseCount);
                }
            }
        }

        Collections.sort(house);


        System.out.println(count);
        for (Integer integer : house) {
            System.out.println(integer);
        }


    }

    public static void dfs(int v1,int v2){
        check[v1][v2]=count;
        houseCount++;
        for(int i=0;i<4;i++){
            if(v1+x[i]>=0&&v2+y[i]>=0&&v1+x[i]<arr.length&&v2+y[i]<arr.length&&arr[v1+x[i]][v2+y[i]]==1&&check[v1+x[i]][v2+y[i]]==0){
                dfs(v1+x[i],v2+y[i]);
            }
        }

    }


}