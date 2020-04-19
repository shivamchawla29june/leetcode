class Solution {
    public String largestMultipleOfThree(int[] digits) {
        String result="";
        int sum=0;
        for(int i=0;i<digits.length;i++)
        {
            sum+=digits[i];
        }
        if(sum==0)
        {
            result="0";
            return result;
        }
        if(sum%3==0)
        {
           Arrays.sort(digits);
            for(int i=digits.length-1;i>=0;i--)
            {
                result+=Integer.toString(digits[i]);
            } 
            return result;
        }
        else
        {
            Arrays.sort(digits);
            ArrayList<Integer> remainder0 = new ArrayList<Integer>();
            ArrayList<Integer> remainder1 = new ArrayList<Integer>();  
            ArrayList<Integer> remainder2 = new ArrayList<Integer>();
            for(int i=0;i<digits.length;i++)
            {
                if(digits[i]%3==0)
               {
                   remainder0.add(digits[i]);
               }
               else if(digits[i]%3==1)
               {
                   remainder1.add(digits[i]);
               }
                else
                {
                  remainder2.add(digits[i]);  
                }
            }
            if(sum%3 == 1)
            {
                if(remainder1.isEmpty())
                {
                    if(remainder2.size()>=2)
                    {
                        remainder2.remove(0);
                        remainder2.remove(0);
                    }
                    else
                    {
                        return "";
                    }
                }
                else
                {
                    remainder1.remove(0);
                }
            }
            else if(sum%3==2)
            {
                if(remainder2.isEmpty())
                {
                    if(remainder1.size()>=2)
                    {
                        remainder1.remove(0);
                        remainder1.remove(0);
                    }
                    else
                    {
                        return "";
                    }
                    
                }
                else
                {
                    remainder2.remove(0);
                }
            }
            remainder0.addAll(remainder1);
            remainder0.addAll(remainder2);
            Collections.sort(remainder0);
            Collections.reverse(remainder0);
            Iterator iterator = remainder0.iterator(); 
            for(int i=0;i<remainder0.size();i++)
            {
                int valueofint = (int) remainder0.get(i); 
                result+=Integer.toString(valueofint);
            }
        }
        return result;
    }
}