class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        Arrays.sort(strs);
        for(int i =0;i<strs[0].length();i++)
        {
            int cnt = 1;
            int index = 1;
            while(index<strs.length && cnt!=0 ){
                if(strs[0].charAt(i) != strs[index].charAt(i))
                {
                    cnt = 0;
                    break;
                } 
                index++;  
            }
            if(cnt == 0)
            {
                return res;
            }
            else res = res+Character.toString(strs[0].charAt(i));
        }
        return res;
    }
}
