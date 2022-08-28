class Solution {
    public String capitalizeTitle(String title) {
       char[] arr = new char[title.length()];
       int i=0, start = 0;
       for (; i < title.length(); i++) {
            arr[i] = Character.toLowerCase(title.charAt(i));
            if (title.charAt(i) == ' ') {
                if (i - start > 2) {
                    arr[start] = (char) (arr[start] - 32);
                }
                start = i + 1;
            }            
        }
        if (i - start > 2) {
            arr[start] = (char) (arr[start] - 32);
        }
        return new String(arr);
    }
}
