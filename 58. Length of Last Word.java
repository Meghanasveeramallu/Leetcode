class Solution {
    public int lengthOfLastWord(String s) {
        int pos=s.length()-1;
        int count=0;
        while(pos>=0)
        {
            if(s.charAt(pos)!=' ')
                count++;
            else
                if(count>0)
                    return count;
            pos-=1; 
        }
        return count;
        
    }
}
