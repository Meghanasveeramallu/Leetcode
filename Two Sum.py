class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        history = {}
        for i, num in enumerate(nums):
            print(i,num)
            if num in history:
                return [i,history[num]]
            else:
                history[target-num]=i
