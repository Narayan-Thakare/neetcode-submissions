class Solution {
    public int[] plusOne(int[] ar) {


for(int i = ar.length-1 ; i>=0 ;i--){

if(ar[i]<9){
ar[i]++;
return ar;
} 
else ar[i]=0;
}
       
int newar[] = new int [ar.length+1];
newar[0]=1;
return newar;

        
    }
}
