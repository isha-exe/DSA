import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(transpose(arr)));
    }
    static int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix.length];
        for(int i =0;i<matrix.length;i++){
            for(int j = 0; j < matrix[i].length; j++){
                res[i][j] = matrix[j][i];
                }
            }
        return res;
    }
}
