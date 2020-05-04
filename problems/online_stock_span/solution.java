class StockSpanner {
 
    Stack<Integer> prices= new Stack<>();
    Stack<Integer> weight = new Stack<>();
    
    public int next(int price) {
        int w=1;
        while(!prices.isEmpty() && (prices.peek()<=price))
        {
            prices.pop();
            w+=weight.pop();
        }
        prices.push(price);
        weight.push(w);
        return w;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */