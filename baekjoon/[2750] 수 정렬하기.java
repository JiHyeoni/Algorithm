import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}