package leetcode;

public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		   int m = matrix.length;
			int n = matrix[0].length;
			boolean firstc = false;
			boolean firstr = false;
			
			for(int  i = 0; i < m ;i++){
	        	if(matrix[i][0] == 0){
	        		firstc = true;
	        		break;
	        	}
	        }
	        for(int  j = 0; j < n ;j++){
	        	if(matrix[0][j] == 0){
	        		firstr = true;
	        		break;
	        	}
	        }
			for(int i = 1;i<m;i++)
				for(int j = 1;j<n;j++){
					if(matrix[i][j] == 0){
						matrix[i][0] = 0;
						matrix[0][j] = 0;
					}
				}
	        for(int  i = 1; i < m ;i++){
	        	if(matrix[i][0] == 0)
	        		for(int j = 1;j<n;j++) matrix[i][j] = 0;
	        }
	        for(int  j = 1; j < n ;j++){
	        	if(matrix[0][j] == 0)
	        		for(int i = 1;i<m;i++) matrix[i][j] = 0;
	        }
	        if(firstc)
	        	for(int i = 0;i<m;i++) matrix[i][0] = 0;
	        if(firstr)	
	        	for(int j = 0;j<n;j++) matrix[0][j] = 0;
    }
}
