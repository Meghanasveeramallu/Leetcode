class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==0) return false;
        int answer = getAns(n);
        return answer==1;
    }
    public int getAns(int n){
        if(n==1) return 1;
        if(n%2!=0) return 0;
        return getAns(n/2);
    }
}
