class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        for (int i : nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        int out = 0;
        int count1 = 0;
        for (int i : count.keySet()){
            if (count.get(i) > count1){
                out = i;
                count1 = count.get(i);
            }
        }
        return out;
    }
}