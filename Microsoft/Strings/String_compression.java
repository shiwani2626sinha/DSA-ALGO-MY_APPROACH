class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1)
            return 1;
        StringBuilder sb = new StringBuilder();
        int count = 1; int i;
        for(i = 1; i<chars.length;i++)
        {
            if(chars[i] != chars[i-1])
            {
                sb.append(chars[i-1]);
                    if(count>1)
                        sb.append(count);
                count = 1;
            } 
            else
                count++;
        }
        sb.append(chars[i-1]);
        if(count>1)
            sb.append(count);
        int index = 0;
        int cnt =0;
        for(i = 0;i<sb.length();i++)
        {
            chars[i] = sb.charAt(i);
                
        }
        return sb.length();
    }
}
