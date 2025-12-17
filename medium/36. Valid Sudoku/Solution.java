package main;

public class Solution {
    public static boolean isValidSudoku(char[][] board){
 
	    return isValidRow(board) && isValidColumn(board) && isValidBlock(board);
    }
    
    private static boolean isValidRow(char[][] board){
    	
    	int n = board.length;
    	
    	for(int k = 0; k < n; k++) {
    		
	    	for(int i = 0; i < board[0].length; i++){
	    		
	    		for(int j = 0; j < board[0].length; j++){
	    			
	    			if(i != j && board[k][i] == board[k][j] && board[k][i] != '.'){
	    				//System.out.println("reprovou nas linhas");
	    				return false;
	    			}
	    		}
	    	}
    	}
    	
    	return true;
    }
    
    private static boolean isValidColumn(char[][] board){
    	
    	int n = board.length;
    
    	for(int k = 0; k < board[0].length; k++) {
    		
	    	for(int i = 0; i < n; i++){
	    		
	    		for(int j = 0; j < n; j++){
	    			
	    			if(i != j && board[i][k] == board[j][k] && board[i][k] != '.'){
	    				//System.out.println("reprovou nas colunas");
	    				return false;
	    			}
	    		}
	    	}
    	}
    	
    	
    	return true;
    }
    
    private static boolean isValidBlock(char[][] board){
    	
    	for(int counti = 0; counti < 3; counti++){
    		
	    	for(int countj = 0; countj < 3; countj++){
	    	
			    	for(int i = 0 + 3 * counti; i < 3 * (counti + 1); i++){
			    		
			    		for(int j = 0 + 3 * countj; j < 3 * (countj + 1); j++){
			    			
			    			if(board[i][j] != '.') {
			    				
				    			for(int k = 0 + 3 * counti; k < 3 * (counti + 1); k++){
				    				
				    				for(int l = 0 + 3 * countj; l < 3 * (countj + 1); l++){
				    					
				    					if(board[i][j] == board[k][l] && i != k && j != l){
				    						//System.out.println("reprovou nos blocos");
				    						return false;
				    					}
				    				}	
				    			}
			    			}
			    		}
			    	}
	    	}
    	}
		 
    	return true;
    }
}