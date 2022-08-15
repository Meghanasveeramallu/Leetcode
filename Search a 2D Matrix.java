class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0, h = m*n -1, mid;
        while (l<=h){
            mid=(l+h)/2;
            int i = mid / m;
            int j = mid % m;
            if (target > matrix[i][j])
                l=mid+1;
            else if (target < matrix[i][j])
                h = mid - 1;
            else
                return true;
        }
        return false;

    }
}
