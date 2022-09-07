class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> hMap = new HashMap<>();
        int m=0;
        for(int i=0; i<s.length();i++){
            if(hMap.containsKey(s.charAt(i))){
                m=i;
                break;
            }
            else{
                hMap.put(s.charAt(i), 1);
            }
        }
        return s.charAt(m);
    }
}
