class Solution {
    public String convert(String s, int numRows) {
        if(numRows ==1)
            return s;
        ArrayList<String> arr = new ArrayList<String>();
        int prevRow = 0;
        int row = -1;
        for(int i =0;i<numRows;i++){
             arr.add("");
        }
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(prevRow == 0)
            {
                row++;
                arr.set(row,arr.get(row)+Character.toString(c));
                if(row==numRows-1)
                {
                    prevRow = numRows-1;
                }
            }
            else if(prevRow == numRows-1)
            {
                row--;
                arr.set(row,arr.get(row)+Character.toString(c));
                if(row == 0)
                {
                    prevRow = 0;
                }
            }
        }
        
        String res = "";
        
        for(String i : arr)
        {
              
                    res = res+i;
            
        }
        return res;
    }
}
