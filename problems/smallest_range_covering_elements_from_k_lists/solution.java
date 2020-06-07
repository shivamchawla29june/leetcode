class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int minValue=Integer.MAX_VALUE;
        int maxValue=Integer.MIN_VALUE;
        int range = Integer.MAX_VALUE;
        PriorityQueue<heap> minHeap = new PriorityQueue<>(new Comparator<heap>(){
            @Override
            public int compare(heap s1,heap s2)
            {
                return s1.value-s2.value;
            }
        });
        int max=0;
        for(int i=0;i<nums.size();i++)
        {
            int value= nums.get(i).get(0);
            max=Math.max(max,value);
            heap heapinsert = new heap(value,i,0);
            minHeap.add(heapinsert);
        }
        while(true)
        {
            heap temp=minHeap.poll();
            if(max-temp.value<range)
            {
                range=max-temp.value;
                minValue=temp.value;
                maxValue=max;
            }
            
            if(nums.get(temp.listName).size()>((temp.listIndex)+1))
            {
                int value=nums.get(temp.listName).get(temp.listIndex+1);
                max=Math.max(max,value);
                heap heapinsert= new heap(value,temp.listName,temp.listIndex+1);
                minHeap.add(heapinsert);
            }
            else
            {
                break;
            }
        }
        
        return new int[]{minValue,maxValue};
    }
    class heap{
        int value;
        int listName;
        int listIndex;
        public heap(int value,int listName, int listIndex)
        {
            this.value=value;
            this.listName=listName;
            this.listIndex=listIndex;
        }
    }
}
