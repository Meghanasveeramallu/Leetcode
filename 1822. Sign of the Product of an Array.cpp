class Solution {
public:
    int arraySign(vector<int>& nums) {
        int cnt = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums[i] == 0) return 0;
            else if(nums[i] < 0) cnt++;
        }
        return cnt%2 ? -1 : 1;
    }
};
