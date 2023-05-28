package problems.arraysandhashing;

import java.util.Arrays;

public class ValidSudokuQ36 {

  public boolean isValidSudoku(char[][] board) {
    int[] map = new int[9];
    for (int i = 0; i < 9; i++) {
      Arrays.fill(map, 0);
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.') {
          map[board[i][j] - '1']++;
        }
      }
      if (!isOkay(map)) {
        return false;
      }
    }

    for (int i = 0; i < 9; i++) {
      Arrays.fill(map, 0);
      for (int j = 0; j < 9; j++) {
        if (board[j][i] != '.') {
          map[board[j][i] - '1']++;
        }
      }
      if (!isOkay(map)) {
        return false;
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        Arrays.fill(map, 0);
        for (int m = 3 * i; m < 3 * (i + 1); m++) {
          for (int n = 3 * j; n < 3 * (j + 1); n++) {
            if (board[m][n] != '.') {
              map[board[m][n] - '1']++;
            }
          }
        }
        if (!isOkay(map)) {
          return false;
        }
      }
    }
    return true;


  }

  private Boolean isOkay(int[] arr) {
    for (int obj : arr) {
      if (obj > 1) {
        return false;
      }
    }
    return true;

  }
}
