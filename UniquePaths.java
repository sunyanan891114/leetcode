package leetcode;

public class UniquePaths {
public static int uniquePaths(int m, int n) {
        int[][] r  = new int[m+1][n+1];
        int i ;
        for(i=0;i<n+1;i++){
        	r[0][i] = 1;
        }
        for(i=0;i<m+1;i++){
        	r[i][0] = 1;
        }
        for(i=1;i<m+1;i++)
        	for(int j=1;j<n+1;j++){
        		r[i][j] = r[i-1][j] + r[i][j-1];
        	}
        return r[m][n];        
    }
public static void main(String[] args){
	System.out.println(uniquePaths(2,2));
}
}
