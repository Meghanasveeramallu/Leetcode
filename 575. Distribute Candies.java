class Solution {
    public int distributeCandies(int[] candyType) {
        boolean[] b = new boolean[200001];
        int count = 0;
        for(int i : candyType){
            int temp = i + 100000;
            if (!b[temp]){
                if (++count == candyType.length / 2) return count;
                b[temp] = true;
            }
        }
        return count;
    }
}
