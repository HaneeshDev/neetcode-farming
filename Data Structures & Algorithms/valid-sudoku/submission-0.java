class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int row = 0; row < 9; row++) {
            HashSet<Character> map = new HashSet<>();

            for (int col = 0; col < 9; col++) {
                char num = board[row][col];

                if (num != '.') {
                    if (!map.add(num)){
                        return false;
                    }
                }
            }
        }

        // Check columns
        for (int col = 0; col < 9; col++) {
            HashSet<Character> map = new HashSet<>();

            for (int row = 0; row < 9; row++) {
                char num = board[row][col];

                if (num != '.') {
                    if (!map.add(num)) {
                        return false;
                    }
                }
            }
        }

        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                HashSet<Character> map = new HashSet<>();

                for (int row = boxRow; row < boxRow + 3; row++) {
                    for (int col = boxCol; col < boxCol + 3; col++) {

                        char num = board[row][col];

                        if (num != '.') {
                            if (!map.add(num)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}