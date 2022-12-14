class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] table = new boolean[n][n];
        int start=0;
        int max_len =1;
        for(int i=0;i<table.length;i++){
            table[i][i]=true;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                table[i][i+1]=true;
                start=i;
                max_len=2;
            }
        }
        
        for(int k=3;k<=table.length;k++){
            for(int i=0;i<n-k+1;i++){
                int j=i+k-1;
                if(table[i+1][j-1] && s.charAt(i)==s.charAt(j)){
                    table[i][j]=true;
                    if(k>max_len){
                        start=i;
                        max_len=k;
                    }
                }
            }
        }
        return s.substring(start, start+max_len);
    }
}