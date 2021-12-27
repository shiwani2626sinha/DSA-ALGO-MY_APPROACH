class Solution {
    String removeDups(String S) {
        // code here
        String res ="";
        for(int i = 0;i<S.length();i++)
        {
            if(!res.contains(Character.toString(S.charAt(i))))
            res = res + Character.toString(S.charAt(i));
        }
        return res;
    }
}
