class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        nums_rotate = [None] * len(nums)
        
        for i in range(len(nums)):
            j = (i+k) % len(nums)
            nums_rotate[j] = nums[i]
            
        
        for i in range(len(nums_rotate)):
            nums[i] = nums_rotate[i]
