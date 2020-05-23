class MedianFinder {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>(){
       @Override
        public int compare(Integer a, Integer b){
            return b-a;
        }
    });
    /** initialize your data structure here. */
    public MedianFinder() {

    }
    
    public void addNum(int num) {
        if(maxHeap.size()==0&&minHeap.size()==0) 
        { 
            maxHeap.add(num);
            return;
        }
        if(maxHeap.size()!=0 || minHeap.size()!=0)
        {
            if(num>maxHeap.peek())
            {
                minHeap.add(num);
            }
            else
            {
                maxHeap.add(num);
            }            
        }

        int diff=maxHeap.size()-minHeap.size();
        if(diff>1)
        {
            minHeap.add(maxHeap.remove());
        }
        else if(diff<-1)
        {
            maxHeap.add(minHeap.remove());
        }        
    }
    
    public double findMedian() {
        if((minHeap.size()+maxHeap.size()) %2 !=0 )
        {
            return (minHeap.size()>maxHeap.size())? minHeap.peek(): maxHeap.peek();
        }
        else
        {
            Double d1 = Double.valueOf(minHeap.peek()+maxHeap.peek());
            return d1/2;
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */