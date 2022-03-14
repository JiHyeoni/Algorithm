import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int [] check=new int[50];
        Arrays.fill(check,1);
        for(int i=0;i<lost.length;i++){
            check[lost[i]]--;
        }
        for(int i=0;i<reserve.length;i++){
            check[reserve[i]]++;
        }

        for(int i=1;i<=n;i++){
            if(check[i]==2&&check[i-1]==0){
                check[i-1]++;
                check[i]--;
            }
            if(check[i]==2&&check[i+1]==0){
                check[i+1]++;
                check[i]--;
            }
        }

        for(int i=1;i<=n;i++){
            if(check[i]>=1) answer++;
        }

        return answer;
    }
}