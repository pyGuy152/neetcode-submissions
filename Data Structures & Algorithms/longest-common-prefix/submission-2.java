class Solution {
    public String longestCommonPrefix(String[] strs) {
        String biggest_string = "";
        for (String s : strs){
            if (s.length() > biggest_string.length()){
                biggest_string = s;
            }
        }
        String last = "";
        for(int i = 0; i < biggest_string.length()+1; i++){
            String c = biggest_string.substring(0,i);
            for (String s : strs){
                if (s.indexOf(c) != 0){
                    return last;
                }
            }
            last = c;
        }
        return last;
    }
}