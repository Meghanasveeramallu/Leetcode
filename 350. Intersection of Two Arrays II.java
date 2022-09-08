class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)
            return intersect(nums2, nums1);
        int[] pre = new int[1001];
        
        for(int n: nums1)
            pre[n]++;
        int[] ans = new int[nums1.length]; 
        int c = 0;
		
        for(int n: nums2) {
            
            if(pre[n] != 0){
                ans[c++] = n;
                pre[n]--;
            }
        }
		
        return Arrays.copyOf(ans, c);
    }
}
