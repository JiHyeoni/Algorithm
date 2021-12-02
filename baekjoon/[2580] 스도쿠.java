import java.util.*;

class Main{
    static int arr[][];
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        arr=new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j]=s.nextInt();
            }
        }

        sudoku(0,0);
    }

    public static void sudoku(int row, int col){
        if(col==9){
            sudoku(row+1,0);
            return;
        }
        if(row==9){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    sb.append(arr[i][j]+" ");
                }
                sb.append("\n");
            }
            System.out.print(sb);
            System.exit(0);
        }
        if(arr[row][col]==0){
            for(int i=1;i<=9;i++){
                if(Possible(row,col,i)){
                    arr[row][col]=i;
                    sudoku(row,col+1);
                }
            }
            arr[row][col]=0;
            return;
        }

        sudoku(row,col+1);
        return;
    }

    public static boolean Possible(int row,int col,int value){
        for(int i=0;i<9;i++){
            if(arr[row][i]==value) return false;
            else if(arr[i][col]==value) return false;
        }

        int start_row=(row/3)*3;
        int start_col=(col/3)*3;

        for(int i=start_row;i<start_row+3;i++){
            for(int j=start_col;j<start_col+3;j++){
                if(arr[i][j]==value) return false;
            }
        }
        return true;
    }
}