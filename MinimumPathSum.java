package leetcode;

public class MinimumPathSum {
	public static int minPathSum(int[][] grid) {
        int m = grid.length-1;
        int n = grid[0].length-1;    
        if(m == -1) return 0;
        int[][] path = new int[m][n];
        return minPathSum(grid,m,n,path);
       
    }
	public static int minPathSum(int[][] grid,int m,int n, int[][] path) {
		if(m == 0 && n == 0){
			return grid[0][0];
		}
		if(m == 0) {
			if(path[m][n-1] == 0){
				path[m][n-1] = minPathSum(grid,m,n-1,path);			
			}
			return path[m][n-1]+grid[m][n];
		}		
		if(n == 0){
			if(path[m-1][n] == 0){
				path[m-1][n] = minPathSum(grid,m-1,n,path);
			}
			return path[m-1][n]+grid[m][n];
		}
		if(path[m][n-1] == 0){
			path[m][n-1] = minPathSum(grid,m,n-1,path);			
		}
		if(path[m-1][n] == 0){
			path[m-1][n] = minPathSum(grid,m-1,n,path);
		}
		int x = path[m][n-1];
		int y = path[m-1][n];
		if(m == 0) {
			return x+grid[m][n];
		}		
		if(n == 0){
			return y+grid[m][n];
		}
		if( y <= x)
			return y+grid[m][n];
		else
			return x+grid[m][n];
	}
}
