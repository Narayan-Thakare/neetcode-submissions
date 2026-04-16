class Solution {
    public int[] getConcatenation(int[] ar) {


int newAr[] = new int [ar.length*2];

int index = 0 ;
for(int i =0 ; i<newAr.length;i++){

newAr[i]= ar[index];
++index;
if(index==ar.length)index=0;
}

return newAr;

    }
}