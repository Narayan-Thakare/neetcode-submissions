class Solution {
    public int[] getConcatenation(int[] ar) {


int newAr[] = new int [ar.length*2];
for(int i =0 ; i<ar.length;i++){
newAr[i]=ar[i];
newAr[i+ar.length]=ar[i];
}

return newAr;

    }
}