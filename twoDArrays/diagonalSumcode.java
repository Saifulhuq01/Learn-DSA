package twoDArrays;

public class diagonalSumcode {
    public static void main(String[] args) {
        int mat[][] = {{4,6,7},{2,9,4},{5,5,5}};

        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int mat[][]){
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];

            if (i != (mat.length-1)-i) {
                sum += mat[i][(mat.length-1)-i];
            }
        }
        return sum;
    }
}
