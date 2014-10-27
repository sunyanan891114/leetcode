package leetcode;

public class RotateImage {
	 public static void rotate(int[][] matrix) {
		int n = matrix.length;
        int[][] result = new int[n][n];
        
        for(int i = 0;i<n;i++){
        	for(int j = 0;j<n;j++){
        		result[j][n-i-1] = matrix[i][j];
        	}
        }
        
        for(int i = 0;i<n;i++){
        	for(int j = 0;j<n;j++){
        		matrix[i][j] = result[i][j];        		
        	}
        	}
	    }
	 public static void main(String[] args){
		 int[][]matrix = {{1 ,2},{3 ,4}};
		 rotate(matrix);
		 int n = matrix.length;
		 for(int i = 0;i<n;i++){
	        	for(int j = 0;j<n;j++){
	        		System.out.print(matrix[i][j]+"  ");	        		
	        	}
	        	 System.out.println();
		 }
		
		 
	 }
}
