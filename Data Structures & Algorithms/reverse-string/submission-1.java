class Solution {
    public void reverseString(char[] ch) {
        
int start = 0 ; 
		int end = ch.length-1;

		
		while(start<end) {
			
			ch[start] = (char) (ch[start]^ch[end]);
		  ch[end] = (char) (ch[start]^ch[end]);
		ch[start]= (char) (ch[start]^ch[end]);
		
		start++;
		end--;
		}




    }
}