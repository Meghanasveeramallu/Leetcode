class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hMap = new HashMap<>();
        if(s.length()==1){
            return 0;
        }
        for(char key : s.toCharArray()){
            if(hMap.containsKey(key)){
                hMap.put(key, hMap.get(key) + 1);
            }
            else{
                hMap.put(key, 1);
            }
        }
        for (int i=0;i<s.length();i++){
            if (hMap.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
