package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-06 13:23
 */
public class SolveNQueens_51 {

    private List<List<String>> output = new ArrayList<>();

    int[] rows;

    int[] mains;

    int[] secondary;

    int[] queens;

    int n;

    public  List<List<String>> solveNQueens(int n) {
        rows = new int[n];
        mains = new int[2 * n - 1];
        secondary = new int[2 * n - 1];
        queens = new int[n];
        this.n = n;

        backtrack(0);
        return output;

    }

    private void backtrack(int row) {
        // 回溯结束条件
        if (row >= n) {
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isNotUnderAttack(row,col)) {
                placeQueen(row,col);

                if (row == n - 1) {
                    addSolution();
                }
                backtrack(row + 1);
                removeQueen(row, col);
            }
        }
    }


    private boolean isNotUnderAttack(int row,int col) {
        int res = rows[col] + mains[row - col + n - 1]
                + secondary[row + col];
        return res == 0;
    }

    private void placeQueen(int row, int col) {
        queens[row] = col;
        rows[col] = 1;
        mains[row - col + n - 1] = 1;
        secondary[row + col] = 1;
    }

    private void removeQueen(int row, int col) {
        queens[row] =0;
        rows[col] = 0;
        mains[row - col + n - 1] = 0;
        secondary[row + col] = 0;
    }

    public void addSolution() {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int col = queens[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < col; j++) {
                sb.append(".");
            }
            sb.append("Q");
            for (int j = 0; j < n - col - 1; j++) {
                sb.append(".");
            }
            solution.add(sb.toString());
        }
        output.add(solution);
    }

    public static void main(String[] args) {
        int n = 4;
        SolveNQueens_51 s = new SolveNQueens_51();
        System.out.println(s.solveNQueens(n));
    }
}
