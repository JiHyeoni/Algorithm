class Point{
    int h;
    int w;
    Point(){

    }
    public Point(int h,int w){
        this.h=h;
        this.w=w;
    }
}

class Solution {
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int [][] keypad={{1,2,3},{4,5,6},{7,8,9},{10,0,11}};
        Point lPoint=new Point(3,0);
        Point rPoint=new Point(3,2);
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7) {
                answer+="L";
                Point nowPoint=getNowPoint(keypad,numbers[i]);
                lPoint.h=nowPoint.h;
                lPoint.w=nowPoint.w;
            }
            else if(numbers[i]==3||numbers[i]==6||numbers[i]==9) {
                answer+="R";
                Point nowPoint=getNowPoint(keypad,numbers[i]);
                rPoint.h=nowPoint.h;
                rPoint.w=nowPoint.w;
            }
            else{
                Point nowPoint=getNowPoint(keypad,numbers[i]);
                int lDistance=getDistance(lPoint,nowPoint);
                int rDistance=getDistance(rPoint,nowPoint);

                if(lDistance<rDistance) {
                    answer+="L";
                    lPoint.h=nowPoint.h;
                    lPoint.w=nowPoint.w;
                }
                else if(lDistance>rDistance) {
                    answer+="R";
                    rPoint.h=nowPoint.h;
                    rPoint.w=nowPoint.w;
                }
                else{
                    if(hand.equals("right")) {
                        answer+="R";
                        rPoint.h=nowPoint.h;
                        rPoint.w=nowPoint.w;
                    }
                    else {
                        answer+="L";
                        lPoint.h=nowPoint.h;
                        lPoint.w=nowPoint.w;
                    }
                }
            }
        }
        return answer;
    }

    public static Point getNowPoint(int [][] keypad, int number){
        Point p=new Point();
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(keypad[i][j]==number){
                    p.h=i;
                    p.w=j;
                }
            }
        }
        return p;
    }

    public static int getDistance(Point point, Point nowPoint){
        return Math.abs(point.h-nowPoint.h)+Math.abs(point.w-nowPoint.w);
    }

}

