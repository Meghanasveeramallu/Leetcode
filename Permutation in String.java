class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Freq = new int[26];
        for(char ch : s1.toCharArray()) {
            s1Freq[ch-97]++;
        }
        int l=0,r=0;
        int[] windowFreq = new int[26];
        
        while(r<s2.length()) {
            char ch = s2.charAt(r);
            windowFreq[ch-97]++;
            if(freqMatch(s1Freq,windowFreq)) return true;
            r++;
            if(r >= s1.length()) {                
                char del = s2.charAt(l);
                windowFreq[del-97]--;
                l++;
            }     
        }
        return false;
    }
    
    public boolean freqMatch(int x[], int y[]) {
        for(int i=0;i<26;i++) {
            if(x[i] != y[i]) return false;
        }
        return true;
    }
}
