import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet set = new HashSet(); // custom hashset

           // we add data to hset in following format:
           // rows:   "row"+ row_no+ element
           // column: "column"+ col_no+ element
           // box:    "box"+ row/3*3+column/3+element

          // here we iterate each cell only once . And check in corresponding row ,column , box 

        for(int i=0; i<9; i++){  // iterating through rows
            for(int j=0; j<9; j++){ iterating through columns

                if(board[i][j]!='.'){

                    if(!set.add("row"+i+board[i][j]) || !set.add("column"+j+board[i][j]))
                    return false;

                    if(!set.add("box"+i/3*3+j/3+board[i][j]))
                    return false;
                }
            }
        }
       
       
       return true;
    }
}
