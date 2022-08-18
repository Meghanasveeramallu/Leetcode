class Solution {
    public int numIslands(char[][] grid) {     
        return checkIsLands(grid);
    }
    
    private static int checkIsLands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != '0') {
                    res += countIsland(grid, i, j);
                }
            }
        }
        return res;
    }
    
    private static int countIsland (char[][] grids, int row, int col) {
        if (row < 0 || col < 0 || row >= grids.length || col >= grids[0].length || grids[row][col] == '0') {
            return 0;
        }
        grids[row][col] = '0';
        countIsland(grids, row + 1, col);
        countIsland(grids, row - 1, col);
        countIsland(grids, row, col + 1);
        countIsland(grids, row, col - 1);
        return 1;
    }
}
