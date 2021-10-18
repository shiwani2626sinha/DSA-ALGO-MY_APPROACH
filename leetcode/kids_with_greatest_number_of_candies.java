class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        ArrayList<Boolean> res = new ArrayList();
        for(int i =1;i<candies.length;i++)
        {
            if(candies[i]>max)
                max=candies[i];
        }
        
        for(int i = 0 ;i<candies.length ; i++) {
            if(max<=candies[i]+extraCandies)
              res.add(true);  
            else res.add(false);
        }
        return res;
    }
}
