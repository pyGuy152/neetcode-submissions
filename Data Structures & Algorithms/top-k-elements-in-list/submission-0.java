class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        int[] out = new int[k];
        for (int i = 0; i < k; i++){
            int max = 0;
            int c = 0;
            for (int key : count.keySet()){
                if (c < count.get(key)){
                    max = key;
                    c = count.get(key);
                }
            }
            out[i] = max;
            count.put(max,0);
        }
        return out;
    }
}
