class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        int n=nums.length;
        if (n==1)
            return nums[0];
        for (int i : nums) {
            if (a.containsKey(i)) {
                a.put(i, a.get(i) + 1);
                if (a.get(i)> n/2)
                    return i;
            }
            else {
                a.put(i, 1);
            }
        }
        return 0;
    }
}
