class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0,count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1) count+=1;
            else{
                m=Math.max(m,count);
                count=0;
            }
        }
        if (m<count){
            m=count;
        }
        return m;
    }
}
