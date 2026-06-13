class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean flag = false;
        for(int i : nums){
            flag = set.add(i);
           if(!flag){
            return true;
           }
        }

        return false;


    }
}