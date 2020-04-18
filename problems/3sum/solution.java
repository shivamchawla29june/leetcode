class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> Result = new HashSet();
        if(nums.length<2)
        {
            return Result.stream().distinct().collect(Collectors.toList()); 
        }
        Arrays.sort(nums,0,nums.length);
        int left=0;
        int right=0;
        int result=0;
        for(int i=0;i<nums.length-2;i++)
        {
            left=i+1;
            right=nums.length-1;
            while(left<right)
            {
                result=nums[i]+nums[left]+nums[right];
                if(result==0)
                {
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right]));
                    Result.add(temp);
                }
                if(result>0)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        List<List<Integer>> newList = Result.stream() 
                                      .distinct() 
                                      .collect(Collectors.toList()); 
        return newList;
    }
}