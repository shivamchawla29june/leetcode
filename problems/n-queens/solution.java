class Solution {
    class Position{
        int row,column;
        Position(int row,int column){
            this.row=row;
            this.column=column;           
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result= new ArrayList<>();
        Position[] positions= new Position[n];
        solve(0,positions,result,n);
        return result;       
    }
    
    public void solve(int current, Position[] positions, List<List<String>> result,int n)
    {
        if(n==current)
        {
            StringBuffer tempBuffer= new StringBuffer();                
            List<String> ans= new ArrayList<>();
            for(Position p:positions)
            {
                for(int i=0;i<n;i++)
                {
                    if(p.column==i)
                    {
                        tempBuffer.append("Q");
                    }
                    else
                    {
                        tempBuffer.append(".");
                    }
                }
                ans.add(tempBuffer.toString());
                tempBuffer= new StringBuffer();
            }
            result.add(ans);
            return;

        }   
        
        // Traverse through all the columns to find a acceptable location of the new queen
        for(int col=0;col<n;col++)
        {
            boolean foundSafe=true;
            // Check the locations of the previous queens and if found a acceptable position move on to the next otherwise backtrack and choose a new position for the previous queen
            for(int queens=0;queens<current;queens++)
            {
                if((positions[queens].column==col)||(positions[queens].column-positions[queens].row==(col-current))|| (positions[queens].column+positions[queens].row==(col+current)))
                {
                    foundSafe=false;
                    break;
                }
            }
            if(foundSafe)
            {
                positions[current]=new Position(current,col);
                solve(current+1,positions,result,n);
            }
        }
        
    }
}