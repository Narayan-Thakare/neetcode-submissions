class Solution {
    public boolean hasDuplicate(int[] nums) {

	HashSet<Integer>list = new HashSet<Integer>();

   for(int i : nums)if(!list.add(i))return true;
   
   return false;

        
    }
}