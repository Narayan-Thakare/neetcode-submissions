class Solution {
    public boolean isHappy(int num) {
        
        if(num<10){

if(num==1 || num==7)  return true;
else return false;
        } 


int sum = 0 ;
while(num!=0){
int last = (num%10) * (num%10);
sum +=last;
num/=10;
}
        return isHappy(sum); 


    }
}
