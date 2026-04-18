class Solution {
    public double myPow(double x, int n) {
        
 long N = n; // handle overflow
        
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

double power =1;
        for(int i= 1 ; i<= N ; i++){
            power*=x;
        }

        return power;
    }
}
