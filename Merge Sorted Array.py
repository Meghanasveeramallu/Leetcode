class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        #if m==0:
            
        p=m-1
        q=n-1
        r=m+n-1
        while(p>=0 and q>=0):
            #print(r,q)
            #print(nums1)
            if nums2[q]>=nums1[p]:
                nums1[r]=nums2[q]
                q-=1
            else:
                nums1[r]=nums1[p]
                p-=1
            r-=1
        while(q>=0):
            nums1[r]=nums2[q]
            q-=1
            r-=1
        while(p>=0):
            nums1[r]=nums1[p]
            p-=1
            r-=1
        return nums1
