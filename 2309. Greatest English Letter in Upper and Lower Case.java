class Solution {
    public String greatestLetter(String s) {
        boolean[] vis = new boolean[123];
        for(char ch : s.toCharArray()){
            vis[ch] = true;            
        }
        String ans = new String("");
        for(int i = 'Z';i>='A';i--){
            if(vis[i] && vis[i + 32]){   
                ans = Character.toString(i);
                return ans;
            }
        }
        return ans;
    }
}
