package array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by qiaoying on 2018/7/1.
 */
public class IsValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        if(board == null || board.length < 9 || board[0].length < 9) return false;
        Set<Character> rowset = new HashSet<Character>();
        Set<Character> colset = new HashSet<Character>();
        for (int i = 0; i < 9; i++){
            rowset.clear();
            colset.clear();

            for (int j = 0; j < 9; j++){
                if (i % 3 == 0 && j % 3 == 0){
//                    Set<Character> blockSet = new HashSet<Character>();
//                    for (int )
                    if(!checkBlock(board, i, j)){
                        return false;
                    }

                }
                if (board[i][j] != '.'){
                    if (rowset.contains(board[i][j])){
                        return false;
                    }
                    rowset.add(board[i][j]);
                }

                if (board[j][i] != '.'){
                    if (colset.contains(board[j][i])){
                        return false;
                    }
                    colset.add(board[j][i]);
                }


            }
        }
        return true;

    }


    public static boolean checkBlock(char[][] board, int row, int col)  // 检查块是否有效
     {
                 Set<Character> blockSet = new HashSet<Character>();
                 for(int i = row; i < row + 3; i++)
                     {
                         for(int j = col; j < col + 3; j++)
                             {
                                 if(board[i][j] != '.')
                                     {
                                         if(blockSet.contains(board[i][j]))
                                                 return false;
                                         blockSet.add(board[i][j]);
                                     }
                             }
                     }
                 return true;
             }

    public static void mian(String[] args){

    }
}
