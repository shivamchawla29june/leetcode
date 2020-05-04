class Solution {
    public boolean isValid(String s) {
        if(s.length()==0) return true;
        if(s.length()==1) return false;
        Stack<Character> validity = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c='a';
            if(s.charAt(i)==')')
                c = '(';
            else if(s.charAt(i)=='}')
                c = '{';
            else if(s.charAt(i)==']')
                c='[';
//            System.out.println(validity);
            if(!validity.isEmpty() && c==validity.peek())
            {
                validity.pop();
            }
            else
            {
                validity.push(s.charAt(i));
            }
        }
        if(validity.isEmpty()) return true;
        else return false;      
    }
}