package leetcode;

public class MergeSortedArray {
	public void merge(int A[], int m, int B[], int n) {
        int[] result = new int[m+n];
        int a_index = 0;
        int b_index = 0;
        int i = 0;
        if(m == 0 ) {
        	for(i=0;i<n;i++)
        		A[i] = B[i]; 
        }
        i = 0;
        if(m >0 && n>0){
        while(a_index<m && b_index<n){
        	if(A[a_index] < B[b_index]){
        		result[i] = A[a_index];
        		i++;
        		a_index++;
        	}
        	else if(A[a_index] > B[b_index]){
        		result[i] = B[b_index];
        		i++;
        		b_index++;
        	}
        	else{
        		result[i] = A[a_index];
        		i++;
        		a_index++;
        		result[i] = B[b_index];
        		i++;
        		b_index++;
        	}
        	if( a_index == m )
            	for(;b_index < n;b_index++){
            		result[i] = B[b_index];
            		i++;
            	}
        	else if(b_index == n)
        		for(;a_index < m;a_index++){
            		result[i] = A[a_index];
            		i++;
            	}
        }
        for(i = 0;i<m+n;i++){
        	A[i] = result[i];
        }}
    }
}
