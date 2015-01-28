package leetcode;

public class SpiralMatrixII {
	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		int k = 0;
		int num = 1;	
		int kk = (int) Math.floor((double)n/2);
		while(k <= kk){
			for(int j = k;j < n-k;j++){
				result[k][j] = num;
				num ++;
			}
			for(int i = 1 + k; i < n-k;i++){
				result[i][n-k-1] = num;
				num ++;
			}
			for(int j = n-2-k;j >= k;j--){
				result[n-k-1][j] = num;
				num ++;
			}
			for(int i = n-2-k; i > k;i--){
				result[i][k] = num;
				num ++;
			}
			k++;
			}
        return result;
    }
	public static void print(int[][] result,int n){
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				System.out.print(result[i][j] + " ");
			}
		System.out.println();
		}
	}
	public static void main(String[] args){
		int n = 4;
		print(generateMatrix(n),n);
		
	}
}
