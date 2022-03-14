import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int [] a={1, 2, 3, 4, 5};
        int [] b={ 2, 1, 2, 3, 2, 4, 2, 5};
        int [] c={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int aCount=0;
        int bCount=0;
        int cCount=0;
        int maxValue=Integer.MIN_VALUE;

        for(int i=0;i<answers.length;i++){
            if(a[i%5]==answers[i]) aCount++;
            if(b[i%8]==answers[i]) bCount++;
            if(c[i%10]==answers[i]) cCount++;

        }
        maxValue=Math.max(aCount,Math.max(bCount,cCount));

        List<Integer> list=new ArrayList<>();
        if(maxValue==aCount) list.add(1);
        if(maxValue==bCount) list.add(2);
        if(maxValue==cCount) list.add(3);

        int [] answer=new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}