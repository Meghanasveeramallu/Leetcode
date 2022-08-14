class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        if (n!=0 && n!=1){
            for (int i=0;i<n/2;i++){
                char t=s[i];
                s[i]=s[n-i-1];
                s[n-i-1]=t;
            }
        }
        
    }
}
