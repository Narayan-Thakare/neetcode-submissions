class Solution {
    public int removeElement(int[] ar, int val) {
        
int index=0;
int n = ar.length;
for(int i = 0 ; i<n;i++){

if(ar[i]!=val){

ar[index]=ar[i];
index++;
}
}

return index;



    }
}