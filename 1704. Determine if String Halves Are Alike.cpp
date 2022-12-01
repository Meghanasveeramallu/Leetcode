class Solution {
public:
    bool halvesAreAlike(string s) {
        int answer = 0, limit = s.size()/2, n = s.size();
        for(int i = 0; i < limit; i++)
        if(s[i] == 'a' || s[i] == 'A' || s[i] == 'i' || s[i] == 'I' || s[i] == 'o' || s[i] == 'O' || s[i] == 'u' || s[i] == 'U' || s[i] == 'e' || s[i] == 'E' ) answer++;
        
        for(int i = limit; i < n; i++)
        if(s[i] == 'a' || s[i] == 'A' || s[i] == 'i' || s[i] == 'I' || s[i] == 'o' || s[i] == 'O' || s[i] == 'u' || s[i] == 'U' || s[i] == 'e' || s[i] == 'E' ) answer--;

        return !answer;
    }
};
