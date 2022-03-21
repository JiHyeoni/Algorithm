import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String s_numbers [] = s.split(" ");
        int [] numbers=new int[s_numbers.length];

        for(int i=0;i< s_numbers.length;i++){
            numbers[i]=Integer.parseInt(s_numbers[i]);
        }
        Arrays.sort(numbers);
        answer=numbers[0]+ " "+ numbers[numbers.length-1];
        return answer;
    }
}