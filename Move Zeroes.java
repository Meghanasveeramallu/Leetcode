class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right =0;
        while (right < nums.length  && nums[right] != 0) right ++;
        
        while (left < nums.length && right < nums.length) {
            while (right < nums.length  && nums[right] == 0) right ++;
            while (left < nums.length && nums[left] != 0) left ++;
            
            if (right >= nums.length || left >= nums.length) break;
            
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }
        
    }
}
