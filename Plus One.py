class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        c=1
        n=len(digits)
        for i in range(n-1,-1,-1):
            s=digits[i]+c
            c=s//10
            digits[i]=s%10
            if c==0:
                break
                
        if c==1:
            digits.insert(0,1)
        return digits
