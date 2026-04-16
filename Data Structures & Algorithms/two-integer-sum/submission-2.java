class Solution {
    public int[] twoSum(int[] ar, int target) {

  int newAr[] =new int[2];

for(int i =0 ;i<ar.length;i++){

for(int j = i+1;j<ar.length;j++)

if(target == ar[i]+ar[j]){

    newAr[0]=i;
    newAr[1]=j;
    break;
}

}

return newAr;

    }
}
