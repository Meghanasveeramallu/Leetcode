class Solution {
    public boolean isPowerOfFour(int n) {
        while (n==0)
            return false;
        while (n==1)
            return true;
        while(n%4==0){
            n=n/4;
        }
        return n==1;
    }
}
