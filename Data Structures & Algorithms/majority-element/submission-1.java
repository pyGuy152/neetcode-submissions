class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        for (int i : nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        for (int i : count.keySet()){
            if (count.get(i) > nums.length/2){
                return i;
            }
        }
        return 0;
    }
}