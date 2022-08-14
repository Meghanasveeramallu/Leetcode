class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] nums = new int[r][c];
        if(r*c != mat[0].length*mat.length){
            return mat;
        }
        int x=0,y=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length;j++){
                nums[x][y] = mat[i][j];
                y++;
                if(y==c){
                    x++;
                    y=0;
                }
            }
        }
        return nums;
    }
}
