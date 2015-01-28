package leetcode;

public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(target >= matrix[m-1][0])
        	for(int j = 0;j<n;j++){
    			if(matrix[m-1][j] == target) return true;
    		}
        for(int i = 0;i<m-1;i++){        	
        	if(target >= matrix[i][0] && target < matrix[i+1][0])
        		for(int j = 0;j<n;j++){
        			if(matrix[i][j] == target) return true;
        		}        	
        }
        return false;
    }
}
