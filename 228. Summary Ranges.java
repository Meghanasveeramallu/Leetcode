class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> a = new ArrayList<String>();
        int s=0,e=1;
        for (int i=0;i<nums.length;i++){
            if (i==0) {
                s=nums[i];
                e=nums[i];
            }
            else {
                if (nums[i]==nums[i-1]+1) e=nums[i];
                else {
                    if (s==e) a.add(String.format("%d",s));
                    else a.add(String.format("%d->%d",s,e));
                    s=nums[i];
                    e=nums[i];
                }
            }
            if (i==nums.length-1){
                if (s==e) a.add(String.format("%d",s));
                else a.add(String.format("%d->%d",s,e));
            }
        }
        return a;
    }
}
