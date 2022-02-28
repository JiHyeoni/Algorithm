import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String [] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int arr[]=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }
        int count=0;
        while(true){
            Integer left=null;
            Integer right=null;

            for(int i=1;i<arr.length;i++){
                if(arr[i-1]!=arr[i]){
                    left=i;
                    break;
                }
            }

            for(int i=arr.length-1;i>=0;i--){
                if(left!=null&&arr[i]==arr[left]){
                    right=i;
                    break;
                }
            }

            if(right==null&&left==null) break;

            for(int i=left;i<=right;i++){
                if(arr[i]==0) arr[i]=1;
                else if(arr[i]==1) arr[i]=0;
            }
            count++;
        }

        System.out.println(count);
    }
}