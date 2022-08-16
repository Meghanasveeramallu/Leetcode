class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hMap = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(char key : s.toCharArray()){
            if(hMap.containsKey(key)){
                hMap.put(key, hMap.get(key) + 1);
            }else{
                hMap.put(key, 1);
            }
        }
        for (char containsKey : t.toCharArray()) {
            if(hMap.containsKey(containsKey)){
                if(hMap.get(containsKey) <= 0){
                    return false;
                }
                hMap.put(containsKey, hMap.get(containsKey) -1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
