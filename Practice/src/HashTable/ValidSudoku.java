package HashTable;

import java.util.*;

public class ValidSudoku {
    public boolean validSudoku(char[][] board){
        Map<Integer, Integer>[] rows = new HashMap[9];
        Map<Integer, Integer>[] cols = new HashMap[9];
        Map<Integer, Integer>[] boxes = new HashMap[9];
        for(int i = 0; i < 9; i++){
            rows[i] = new HashMap<>();
            cols[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char num = board[i][j];
                int boxIndex = (i / 3) * 3 + j / 3;
                if(num != '.'){
                    int n = (int) num;
                    rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
                    cols[j].put(n, cols[j].getOrDefault(n, 0) + 1);
                    boxes[boxIndex].put(n, boxes[boxIndex].getOrDefault(n, 0) + 1);
                    if(rows[i].get(n) > 1 || cols[j].get(n) > 1 || boxes[boxIndex].get(n) > 1)
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidSudoku valid = new ValidSudoku();
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(valid.validSudoku(board));
    }
}
