class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() < 2) return "";
        char[] p = palindrome.toCharArray();
        int  n = p.length;
        for(int i=0;i<n/2;i++){
            if(p[i] != 'a'){
                p[i] = 'a';
                String str = String.valueOf(p);
                return str;
            }            
        }
        p[n-1] = 'b';
        String str = String.valueOf(p);
        return str;
    }
}
