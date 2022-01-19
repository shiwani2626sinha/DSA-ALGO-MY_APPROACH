class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        int sum2=0;
        for(int i = 0;i<t.length();i++)
        {
            sum1=sum1+t.charAt(i)-'a';
        }
        for(int i = 0;i<s.length();i++)
        {
            sum2=sum2+s.charAt(i)-'a';
        }
        
        int val = sum1-sum2+97;
        return (char)val;
    }
}
