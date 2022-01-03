class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        
            StringBuilder res = new StringBuilder();
            String val = countAndSay(n-1);
           int cnt = 1; int i = 0;
           for( i = 1;i<val.length();i++)
           {
               if(val.charAt(i) == val.charAt(i-1))
                   cnt++;
               else
               {
                   res.append(cnt).append(val.charAt(i-1));
                   cnt = 1;
               }
           }
            res.append(cnt).append(val.charAt(i-1));
            
            return res.toString();
    }
}
