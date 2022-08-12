class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        map = {}
        for s1, t1 in zip(s, t):
            if s1 not in map:
                if t1 not in map.values():
                    map[s1] = t1
                else:
                    return False
            else:
                if map[s1] != t1:
                    return False
        return True
