class Solution {
    public int mySqrt(int num) {
        
   int start = 1 ; 
   int end = num;
int mid =0 ;
while (start<=end){

 mid = start + (end -start)/2;

long sq =  (long)mid*mid;
if(sq== num){
    return mid;
}else if (sq>num){
    end = mid-1;
}else{
start = mid+1;
}


}

return end;

    }
}