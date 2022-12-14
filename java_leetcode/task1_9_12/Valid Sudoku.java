link:https://leetcode.com/problems/valid-sudoku/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            boolean ifExsist=false;
            int arr[]={0,0,0,0,0,0,0,0,0};
            for(int j=0;j<9;j++)
            {
                if(board[i][j] !='.')
                {
                    ifExsist=true;
                    if(arr[ Integer.parseInt( String.valueOf( board[i][j] ) )-1] ==1) return false;
                    arr[ Integer.parseInt( String.valueOf( board[i][j] ) )-1]=1;
                    /*if(i==8)System.out.println(arr[ Integer.parseInt( String.valueOf( board[i][j] ) )-1]+
                    " "+ (Integer.parseInt( String.valueOf( board[i][j] ) )-1));*/
                }
            }
        }
        
        for(int i=0;i<9;i++)
        {
            int arr[]={0,0,0,0,0,0,0,0,0};
            boolean ifExsist=false;
            for(int j=0;j<9;j++)
            {
                if(board[j][i] !='.')
                {
                    ifExsist=true;
                    if(arr[ Integer.parseInt( String.valueOf( board[j][i] ) )-1]==1) return false;
                    arr[ Integer.parseInt( String.valueOf( board[j][i] ) )-1]=1;
                }
            }
        }
        for(int index=0;index<3;index++)
        {
            int arr[]={0,0,0,0,0,0,0,0,0};
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    if(board[3*index+i][j] !='.')
                    {
                        if(arr[ Integer.parseInt( String.valueOf( board[3*index+i][j] ) )-1]==1) return false;
                        arr[ Integer.parseInt( String.valueOf( board[3*index+i][j] ) )-1]=1;
                    }
                }
            }
        }
        for(int index=0;index<3;index++)
        {
            int arr[]={0,0,0,0,0,0,0,0,0};
            for (int i=0;i<3;i++)
            {
                for (int j=3;j<6;j++)
                {
                    if(board[3*index+i][j] !='.')
                    {
                        if(arr[ Integer.parseInt( String.valueOf( board[3*index+i][j] ) )-1]==1) return false;
                        arr[ Integer.parseInt( String.valueOf( board[3*index+i][j] ) )-1]=1;
                    }
                }
            }
        }
        for(int index=0;index<3;index++)
        {
            int arr[]={0,0,0,0,0,0,0,0,0};
            for (int i=0;i<3;i++)
            {
                for (int j=6;j<9;j++)
                {
                    if(board[3*index+i][j] !='.')
                    {
                        if(arr[ Integer.parseInt( String.valueOf( board[3*index+i][j] ) )-1]==1) return false;
                        arr[ Integer.parseInt( String.valueOf( board[3*index+i][j] ) )-1]=1;
                    }
                }
            }
        }
        return true;
    }
}