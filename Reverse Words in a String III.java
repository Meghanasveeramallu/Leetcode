class Solution {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        int n=a.length;
        for (int i=0;i<n;i++){
            int m=a[i].length();
            if (m!=0){
                char ch[] = a[i].toCharArray();
                for (int j=0; j<m/2;j++){
                    char temp = ch[j];
                    ch[j] = ch[m-j-1];
                    ch[m-j-1] = temp;
                }
                a[i] = String.valueOf(ch);
            }
        }
        String b = String.join(" ", a);
        return b;
    }
}
