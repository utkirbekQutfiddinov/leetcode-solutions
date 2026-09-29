class Solution {
    public int numRookCaptures(char[][] board) {
        int count=0;
        int rookI=0, rookJ=0;
        boolean found=false;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]=='R'){
                    rookJ=j;
                    found=true;
                    break;
                }
            }
            if(found){
                rookI=i;
                break;
            }
        }
        for(int i=rookI; i>=0; i--){
            char c=board[i][rookJ];
            if(c=='B'){
                break;
            }else if(c=='p'){
                count++;
                break;
            }
        }

        for(int i=rookI+1; i<board.length; i++){
            char c=board[i][rookJ];
            if(c=='B'){
                break;
            }else if(c=='p'){
                count++;
                break;
            }
        }

        for(int i=rookJ; i<board[rookI].length; i++){
            char c=board[rookI][i];
            if(c=='B'){
                break;
            }else if(c=='p'){
                count++;
                break;
            }
        }

        
        for(int i=rookJ-1; i>=0; i--){
            char c=board[rookI][i];
            if(c=='B'){
                break;
            }else if(c=='p'){
                count++;
                break;
            }
        }
        return count;
    }
}