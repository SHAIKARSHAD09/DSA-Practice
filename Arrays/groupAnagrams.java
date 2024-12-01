class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> result = new ArrayList<>();
       boolean[] visited = new boolean[strs.length];

       for(int i=0; i<strs.length-1; i++){
        
        if(!visited[i]){
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for(int j=i+1; j<strs.length; j++){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    group.add(strs[j]);
                    visited[j]= true;
                }
            }
            result.add(group);
        }
       }
       for (int i = 0; i < strs.length; i++) {
            if (!visited[i]) {
                result.add(Collections.singletonList(strs[i]));
            }
        }
       return result;
       
    }
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        Arrays.sort(a);
        String str1 = new String(a);

        char[] b = t.toCharArray();
        Arrays.sort(b);
        String str2 = new String(b);

        return str1.equals(str2);
    }
}
