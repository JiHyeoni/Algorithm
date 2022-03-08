import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        if(arr.length==1) {
            int [] answer={-1};
            return answer;
        }

        int[] answer = new int[arr.length-1];
        int copy[]=arr.clone();
        Arrays.sort(copy);

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(copy[0]!=arr[i]) answer[j++]=arr[i];
        }
        return answer;
    }
}