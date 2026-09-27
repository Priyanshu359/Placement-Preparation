class Solution {
    public boolean isValidSudoku(char[][] board) {
             Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        // Initialize sets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse the board
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char num = board[row][col];

                // Ignore empty cells
                if (num == '.') {
                    continue;
                }

                // Find which 3x3 box this cell belongs to
                int boxIndex = (row / 3) * 3 + (col / 3);

                // Check duplicate
                if (rows[row].contains(num) ||
                    cols[col].contains(num) ||
                    boxes[boxIndex].contains(num)) {

                    return false;
                }

                // Add number to all three
                rows[row].add(num);
                cols[col].add(num);
                boxes[boxIndex].add(num);
            }
        }

        return true;
    }
}