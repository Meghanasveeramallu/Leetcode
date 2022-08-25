class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCaseCount =0;
        for(char ch: word.toCharArray()){
            if(ch >='A' && ch <='Z'){
                upperCaseCount++;
            }
        }
        boolean c1 = (upperCaseCount == 1 && word.charAt(0) >='A' && word.charAt(0) <='Z');
        boolean c2 = upperCaseCount == 0; 
        boolean c3 = upperCaseCount == word.length();        
        return c1 || c2 || c3;
    }
}
