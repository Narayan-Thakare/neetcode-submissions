class Solution {
    public void merge(int[] ar1, int m, int[] ar2, int n) {
        
int i =0, j=0 , k=0;
		int sort[] = new int [m+n] ;
		
		while(i < m && j<n  ) {
			
			if(ar1[i]<ar2[j]) {
				sort[k++]=ar1[i++];
			}else
				sort[k++]=ar2[j++];
			
		}
		
		
		while(i<m) {
			sort[k++]=ar1[i++];
		}
		while(j<n) {
			sort[k++]=ar2[j++];
		}
	

		for( i = 0 ; i<sort.length;i++ ) {
			
			ar1[i]=sort[i];
			
		}
        

    }
}