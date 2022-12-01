class Solution {
public:
    bool halvesAreAlike(string s) {
        int answer = 0, limit = s.size()/2, n = s.size();
        for(int i = 0; i < limit; i++){
            if(s[i] == 'a' || s[i] == 'A' || s[i] == 'i' || s[i] == 'I' || s[i] == 'o' || s[i] == 'O' || s[i] == 'u' || s[i] == 'U' || s[i] == 'e' || s[i] == 'E' ) answer++;
            
            if(s[n-i-1] == 'a' || s[n-i-1] == 'A' || s[n-i-1] == 'i' || s[n-i-1] == 'I' || s[n-i-1] == 'o' || s[n-i-1] == 'O' || s[n-i-1] == 'u' || s[n-i-1] == 'U' || s[n-i-1] == 'e' || s[n-i-1] == 'E' ) answer--;

        }

        return !answer;
    }
};
