class Solution {
    public boolean isUgly(int num) {
        while(num>1)
        {
            if(num%2==0) num/=2;
            else break;
        }
        while(num>1)
        {
            if(num%3==0) num/=3;
            else break;
        }
        while(num>1)
        {
            if(num%5==0) num/=5;
            else break;
        }
        if(num==1) return true;
        return false;
        
    }
}