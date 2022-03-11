import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        int money = 0;
        for(int i=0;i<d.length;i++){
            if(d[i]+money>budget) break;
            answer++;
            money+=d[i];
        }
        return answer;
    }
}