class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        p=0
        q=0
        if len(t)<len(s):
            return False
        while(p<len(t) and q<len(s)):
            if t[p]==s[q]:
                q+=1
            p+=1
            if p==len(t) and q<len(s):
                return False
        return True
