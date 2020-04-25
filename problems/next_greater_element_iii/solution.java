class Solution {
    public int nextGreaterElement(int n) {
        int temp = n;
        int count=0;
        int replacelocation=-1;
        int replacenumber=0;
        int replacenumberlocation=0;
        //calculate the size of the array
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }
        int[] nums = new int[count];
        //convert the number into an array
        for(int i=0;n>0;i++)
        {
            nums[i]=n%10;
            n=n/10;
        }
        int start=0;
        int end=nums.length-1;
        //since the array will be reversed, reverse it again to find the number
        while (start < end) 
        {
          int temp1 = nums[start];
          nums[start] = nums[end];
          nums[end] = temp1;
          start++;
          end--;
        }

        //find the first position that need to be replaced
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                replacelocation=i-1;
                break;
            }
        }
        
        //If no replace location found that means the number has no max
        if(replacelocation==-1)
        {
            return -1;
        }
        
        //Sort the array after that location
        Arrays.sort(nums,replacelocation+1,nums.length);
        //Find the number that is just greater than the current number

        for(int i=replacelocation+1;i<nums.length;i++)
        {
            if(nums[i]>nums[replacelocation])
            {
                replacenumber=nums[i];
                replacenumberlocation=i;
                break;
            }
        }
        


        //swap them
        temp=nums[replacelocation];
        nums[replacelocation]=replacenumber;
        nums[replacenumberlocation]=temp;
        
        //sort the array after the replaced location
        Arrays.sort(nums,replacelocation+1,nums.length);

        //convert the array into a number
        start=0;
        end=nums.length-1;
        while (start < end) 
        {
          int temp1 = nums[start];
          nums[start] = nums[end];
          nums[end] = temp1;
          start++;
          end--;
        }
        
        long result=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            result=(result*10L)+nums[i];
        }
        if(result>2147483647)
        {
            return -1;
        }
        return (int)result;
    }
}