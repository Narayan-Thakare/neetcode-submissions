class Solution {

   public int totalBits(int num ){
int count =0 ;
while(num!=0){

    num = num & (num-1);
    count++;
}

return count;
   }


    public int[] countBits(int n) {

       int ar[] = new int[n+1];  

for(int i = 0 ; i <=n ; i++){

    ar[i]=totalBits(i);
}
       return ar;

    }
}
