package twoDArrays;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrixCode {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

                //sr,sc 1 2 3 ec
                //      4 5 6
                //er    7 8 9
        };
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int sr = 0;
        int er = matrix.length-1; 
        int sc = 0; 
        int ec = matrix[0].length-1;

        while(sr <= er && sc <= ec){
            //top
            for(int i=sc; i<= ec; i++){
                ans.add(matrix[sr][i]);
            }
            //right
            for(int i=sr +1; i<= er; i++){
                ans.add(matrix[i][ec]);
            }
            //bottom
            for(int i=ec-1; i>=sc ; i--){
                if(sr==er){
                    break;
                }
                ans.add(matrix[er][i]);
            }
            //left
            for(int i=er-1 ; i>=sr+1; i--){
                
                if(sc==ec){
                    break;
                }
                ans.add(matrix[i][sc]);
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
        return ans;
    }
}
