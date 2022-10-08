class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int maxSum=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int sum=0;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r) {
                sum=nums[i]+nums[l] +nums[r];
                int diff = Math.abs(sum-target);
                if(diff==0)
                return sum;
                else if (diff<minDiff) {
                    maxSum=sum;
                    minDiff=diff;
                }
                if(sum<target) l++;
                else if(sum>target) r--;
            }
        }
        return maxSum;
    }
}
