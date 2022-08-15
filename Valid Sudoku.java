class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
			HashSet<Character> first = new HashSet<>();
			HashSet<Character> second = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.' && !first.add(board[i][j])) {
					return false;
				}
				if (board[j][i] != '.' && !second.add(board[j][i])) {
					return false;
				}
			}
		}
		for (int row = 0; row < 9; row += 3) {
			for (int col = 0; col < 9; col += 3) {
				HashSet<Character> next = new HashSet<>();
				for (int i = row; i < row + 3; i++) {
					for (int j = col; j < col + 3; j++) {
						if (board[i][j] != '.' && !next.add(board[i][j])) {
							return false;
						}
					}
				}
			}
		}
		return true;
    }
}
