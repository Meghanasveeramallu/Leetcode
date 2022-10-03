class Solution {
    private int sum(int[] arr, int start, int end) {
        int sum = arr[start];
        int max = arr[start];
        for (int i = start + 1; i < end; ++i) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        return sum - max;
    }

    public int minCost(String colors, int[] neededTime) {
        int lastIndex = 0;
        int ret = 0;
        int i = 1;
        char[] c = colors.toCharArray();
        for (; i < c.length; ++i) {
            if (c[i] != c[i - 1]) {
                ret += sum(neededTime, lastIndex, i);
                lastIndex = i;
            }
        }
        return ret + sum(neededTime, lastIndex, i);   
    }
}
