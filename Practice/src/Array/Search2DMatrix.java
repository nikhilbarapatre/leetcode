package Array;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target){
        int i = 0, j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target)
                return true;
            if(matrix[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix search = new Search2DMatrix();
        int[][] matrix = {{1, 3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
        System.out.println(search.searchMatrix(matrix, 231));
    }
}
