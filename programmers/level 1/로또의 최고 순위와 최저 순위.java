class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int matchCount=0;
        int zeroCount=0;
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                zeroCount++;
                continue;
            }
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i]==win_nums[j]){
                    matchCount++;
                    continue;
                }
            }
        }

        answer[0]=7-(matchCount+zeroCount)>6?6:7-(matchCount+zeroCount);
        answer[1]=7-matchCount>6?6:7-matchCount;

        System.out.println(zeroCount+" "+matchCount);
        return answer;
    }
}