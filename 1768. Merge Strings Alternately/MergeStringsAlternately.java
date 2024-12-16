class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();

        char[] result = new char[len1 + len2];

        int idx = 0;

        for(int i = 0; i < Math.max(len1, len2); i++) {
            if(i < len1) result[idx++] = word1.charAt(i);
            if(i < len2) result[idx++] = word2.charAt(i);
        }

        return new String(result);
    }
}

public class MergeStringsAlternately {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(solution.mergeAlternately(word1, word2));
    }
}
