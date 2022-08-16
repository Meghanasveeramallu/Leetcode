class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int n = nums.length;
        int h=n-1;
        int m;
        while(l<=h){
            m=(l+h)/2;
            if (nums[m]>target)
                h=m-1;
            else if (nums[m]<target)
                l=m+1;
            else
                return m;
        }
        return -1;    
    }
}
