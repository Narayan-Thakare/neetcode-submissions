class Solution {
    public int majorityElement(int[] nums) {

      int ar [] = new int [1000];


      for( int i =0 ; i<nums.length ; i++){

ar[nums[i]]++;

      }



  int max=Integer.MIN_VALUE;
int index=0 ;

	   for( int i =0 ; i<ar.length ; i++){

		   if(max<ar[i]) {
			   max=ar[i];
			   index = i;
		   }


	      }
		

        return index;

      


    }
}