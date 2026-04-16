class Solution {
    public int removeElement(int[] ar, int val) {
        
int index=0;
for(int i = 0 ; i<ar.length;i++){

if(ar[i]!=val){

ar[index]=ar[i];
index++;
}
}

return index;



    }
}