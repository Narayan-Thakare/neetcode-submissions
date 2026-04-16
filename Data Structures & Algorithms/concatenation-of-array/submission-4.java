class Solution {
    public int[] getConcatenation(int[] ar) {

int n = ar.length;

int newAr[] = new int [ar.length*2];
for(int i =0 ; i<ar.length;i++){
newAr[i]=ar[i];
newAr[i+n]=ar[i];
}

return newAr;

    }
}