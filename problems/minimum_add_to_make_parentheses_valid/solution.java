class Solution {
    public int minAddToMakeValid(String S) {
        if(S.length()==0 ||S.length()==1) return S.length();
        Stack<Character> validity = new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            char c='a';
            if(S.charAt(i)==')')
                c = '(';
            if(!validity.isEmpty() && c==validity.peek())
            {
                validity.pop();
            }
            else
            {
                validity.push(S.charAt(i));
            }
        }
        return validity.size();
    }
}