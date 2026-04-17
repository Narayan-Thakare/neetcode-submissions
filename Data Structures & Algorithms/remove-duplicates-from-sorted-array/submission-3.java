class Solution {
    public int removeDuplicates(int[] ar) {

   int count =0 ;
		int index=0;
		int i = 0;
		for (; i < ar.length-1; i++) {
			
			if(ar[i]!=ar[i+1]) {
				count++;
				ar[index++]=ar[i];
			}
		}
		ar[index++]=ar[i];


return count+1;
    }
}