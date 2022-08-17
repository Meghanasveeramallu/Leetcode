class Solution {
    public int calArea(int[][]grid,int i,int j,int m,int n) {
        if(i>=m||i<0||j>=n||j<0||grid[i][j]==0)
            return 0;
        grid[i][j]=0;
        return 1+calArea(grid,i-1,j,m,n)+calArea(grid,i+1,j,m,n)+calArea(grid,i,j-1,m,n)+calArea(grid,i,j+1,m,n);
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int i,j,m,n,maxArea=0;
        m=grid.length;
        n=grid[0].length;
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                    maxArea=Math.max(maxArea,calArea(grid,i,j,m,n));
            }
        }
        return maxArea;
    }
}
