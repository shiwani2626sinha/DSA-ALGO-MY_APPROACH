class Solution {
    public List<List<String>> Anagrams(String[] slist) {
        // Code here
        Map<String, List<String>> mp = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        
        for(int i =0;i<slist.length;i++){
            char[] temp = slist[i].toCharArray();
            Arrays.sort(temp);
            String temp1 = Arrays.toString(temp);
            if(mp.containsKey(temp1))
            mp.get(temp1).add(slist[i]);
            else
            {
                List<String>list = new ArrayList<>();
                list.add(slist[i]);
                mp.put(temp1,list);
            }
            
            }
            
            for(String s : mp.keySet())
            {
                res.add(mp.get(s));
            }
            return res;
        }
    
}
