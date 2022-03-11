import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        List list=new ArrayList(set);
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=(int)list.get(i);
        }
        return answer;
    }
}