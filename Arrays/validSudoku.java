class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length; // Sudoku board size is 9x9
        HashSet<Character> set = new HashSet<>();

        // Check rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Character.isDigit(board[i][j])) {
                    if (set.contains(board[i][j])) {
                        return false; // Duplicate in row
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
            set.clear(); // Clear for the next row
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (Character.isDigit(board[i][j])) {
                    if (set.contains(board[i][j])) {
                        return false; // Duplicate in column
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
            set.clear(); // Clear for the next column
        }

        // Check 3x3 submatrices
        for (int square = 0; square < 9; square++) { // 9 submatrices
            for (int i = 0; i < 3; i++) { // Rows within the submatrix
                for (int j = 0; j < 3; j++) { // Columns within the submatrix
                    int row = (square / 3) * 3 + i; // Row offset
                    int col = (square % 3) * 3 + j; // Column offset
                    if (Character.isDigit(board[row][col])) {
                        if (set.contains(board[row][col])) {
                            return false; // Duplicate in submatrix
                        } else {
                            set.add(board[row][col]);
                        }
                    }
                }
            }
            set.clear(); // Clear for the next submatrix
        }

        return true; // No duplicates found
    }
}
