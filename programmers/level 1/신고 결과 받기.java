import java.util.*;

class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int [id_list.length];
        //피신고인, 신고인
        Map<String,List> reportMap=new HashMap<>();
        //신고인, 횟수
        Map<String,Integer> reportCnt=new HashMap<>();

        for(int i=0;i<id_list.length;i++){
            reportMap.put(id_list[i],null);
            reportCnt.put(id_list[i],0);
        }

        for(int i=0;i<report.length;i++){
            String [] reportSep=report[i].split(" ");

            //피신고인을 신고한 사람이 없으면
            if(reportMap.get(reportSep[1])==null){
                List<String> list=new ArrayList<>();
                list.add(reportSep[0]);
                reportMap.put(reportSep[1],list);
            }

            //피신고인을 신고한 사람이 있었으면
            else{
                List<String> list=reportMap.get(reportSep[1]);
                //피신고인 신고 리스트에 없는 신고인을 추가
                if(!list.contains(reportSep[0])){
                    list.add(reportSep[0]);
                    reportMap.put(reportSep[1],list);
                }
            }
        }


        for(int i=0;i<reportMap.size();i++){
            //피신고인을 신고한 사람이 없으면
            if(reportMap.get(id_list[i])==null)
                continue;

            List<String> existList=reportMap.get(id_list[i]);
            //피신고자를 신고한 사람의 수가 k보다 많거나 같으면
            if(existList.size()>=k){
                //신고한 사람의 횟수를 +1
                for(int j=0;j<existList.size();j++){
                    int cnt=reportCnt.get(existList.get(j));
                    reportCnt.put(existList.get(j),cnt+1);
                }
            }
        }

        for(int i=0;i<id_list.length;i++){
            answer[i]=reportCnt.get(id_list[i]);
        }

        return answer;
    }
}