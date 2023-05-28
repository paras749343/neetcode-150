package problems.binarysearch;

public class SearchA2DMatrixQ74 {

  public boolean searchMatrix(int[][] matrix, int target) {
    int row_start = 0;
    int row_end = matrix.length - 1;
    int row_length = matrix[0].length;
    int row_mid = (row_start + row_end) / 2;
    while (row_start <= row_end) {
      if (target < matrix[row_mid][0]) {
        row_end = row_mid - 1;
        row_mid = (row_start + row_end) / 2;
      } else if (target > matrix[row_mid][row_length - 1]) {
        row_start = row_mid + 1;
        row_mid = (row_start + row_end) / 2;
      } else {
        row_start = 0;
        row_end = row_length - 1;
        row_length = (row_start + row_end);
        while (row_start <= row_end) {
          if (matrix[row_mid][row_length] < target) {
            row_start = row_length + 1;
            row_length = (row_start + row_end);
          } else if (matrix[row_mid][row_length] > target) {
            row_end = row_length - 1;
            row_length = (row_start + row_end);
          } else {
            return true;
          }
        }
        break;
      }
    }
    return false;

  }
}
