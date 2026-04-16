class Solution {
    public int[] twoSum(int[] ar, int target) {

  int newAr[] =new int[2];

  int n = ar.length;

for(int i =0 ;i<n;i++){

for(int j = i+1;j<n;j++)

if(target == ar[i]+ar[j]){

    newAr[0]=i;
    newAr[1]=j;
    break;
}

}

return newAr;

    }
}
