import java.util.*;

class Solution {
    public int solution(int[][] sizes) {

        int w_max=Integer.MIN_VALUE;
        int h_max=Integer.MIN_VALUE;
        for(int i=0;i<sizes.length;i++){
            w_max=Math.max(w_max,Math.max(sizes[i][0],sizes[i][1]));
            h_max=Math.max(h_max,Math.min(sizes[i][0],sizes[i][1]));
        }

        int answer = w_max*h_max;
        return answer;
    }
}