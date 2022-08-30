class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int n=num1.length()-1;
        int m=num2.length()-1;
        int carry=0;
        int sum=0;
        int i=n;
        int j=m;
        while(i>=0 || j>=0 ){
         sum=carry;
            if(i>=0) 
                sum+=num1.charAt(i--)-'0';
            if(j>=0)
                sum+=num2.charAt(j--)-'0';
            sb.append(sum%10);
            carry=sum/10;
            
            
        }
        if(carry>0)
            sb.append(carry);
        
        return sb.reverse().toString();
    }
}
