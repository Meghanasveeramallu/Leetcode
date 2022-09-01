class Solution {
    public int maxPower(String s) {
        int max = 1; 
        int count = 1;
        for(int i = 0; i< s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
                max = Math.max(count, max);
            } else {
                count = 1;
            }
        }       
        return max;
    }
}
