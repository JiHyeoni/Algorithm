// 여섯줄과 낱개를 각각 따로 받아서 젤 가격싼걸로..
// 낱개로사는게 싼지 여러개로 사는게 싼지확인

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        int [] six=new int[m];
        int [] one=new int[m];

        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine()," ");
            six[i]=Integer.parseInt(st.nextToken());
            one[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(six);
        Arrays.sort(one);

        int money=0;

        if(n>=6){
            int num=n/6;
            if(six[0]>one[0]*6) {
                money+=one[0]*6*num;
            }
            else{
                money+=six[0]*num;
            }
            n-=num*6;
        }

        if(n>0&&n<6){
            if(six[0]<one[0]*n){
                money+=six[0];
            }
            else{
                money+=one[0]*n;
            }
            n-=n;
        }

        System.out.println(money);

    }
}