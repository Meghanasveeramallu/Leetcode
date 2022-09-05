class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        for(int i=0; i<nums1.length;i++){
            int index=0;
            for(;nums2[index]!=nums1[i];index++)
                ;
            int nextGreater = -1;
            for(int j=index+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    nextGreater = nums2[j];
                    break;
                }
            }
            answer[i]=nextGreater;
        }
        return answer;
    }
}
