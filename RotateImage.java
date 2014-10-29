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
	 public static void rotate2(int[][] matrix) {
		 int n = matrix.length;
		 int temp ;
		 for(int j = 0;j<n/2;j++){
			 for(int i = j;i<n-1-j;i++){
					 temp = matrix[n-i-1][j];
					 matrix[n-i-1][j] = matrix[n-1-j][n-1-i];
					 matrix[n-1-j][n-1-i] = matrix[i][n-1-j];
					 matrix[i][n-1-j] = matrix[j][i];
					 matrix[j][i] = temp;	
					 System.out.println("i is " +i+" j is "+j);
					 for(int ii = 0;ii<n;ii++){
				        	for(int jj = 0;jj<n;jj++){
				        		System.out.print(matrix[ii][jj]+"  ");	        		
				        	}
				        	 System.out.println();
					 }
			 }
		 }
	 }
	 public static void main(String[] args){
		 int n =6;
		 int[][] matrix = new int[n][n];
		 int temp = 1;
		 for(int i = 0;i<n;i++){
	        	for(int j = 0;j<n;j++){
	        		matrix[i][j] =  temp;
	        		temp++;
	        	}
		 }
		 rotate2(matrix);
		 System.out.println(n);
		 for(int i = 0;i<n;i++){
	        	for(int j = 0;j<n;j++){
	        		System.out.print(matrix[i][j]+"  ");	        		
	        	}
	        	 System.out.println();
		 }
		
		 
	 }
}
