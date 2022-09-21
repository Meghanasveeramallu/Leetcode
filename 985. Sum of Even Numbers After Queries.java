class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int len = queries.length;
        int[] ans = new int[len];
        int n = nums.length;
        int sum = 0;
        for(int i : nums){
            if(i%2 == 0){
                sum += i;
            }
        }
        for(int i = 0 ; i < len ; i++){
            int pre = nums[queries[i][1]];
            int post = pre + queries[i][0];
            if(Math.abs(pre)%2 == 0 && Math.abs(post)%2 == 0){
                sum -= pre;
                sum += post;
            }
            else if(Math.abs(pre)%2 == 0 && Math.abs(post)%2 == 1){
                sum -= pre;
            }
            else if(Math.abs(pre)%2 == 1 && Math.abs(post)%2 == 0){
                sum += post;
            }
            nums[queries[i][1]] = post;
            ans[i] = sum;
        }
        return ans;
    }
}
