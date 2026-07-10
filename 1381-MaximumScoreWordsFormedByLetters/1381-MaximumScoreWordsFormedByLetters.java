// Last updated: 7/10/2026, 11:54:58 AM
class Solution {

    public int maxScoreWords(String[] words,
                             char[] letters,
                             int[] score) {

        int[] freq = new int[26];

        for(char c : letters) {
            freq[c - 'a']++;
        }

        return dfs(words, score, freq, 0);
    }

    private int dfs(String[] words,
                    int[] score,
                    int[] freq,
                    int idx) {

        if(idx == words.length)
            return 0;

        // Skip current word
        int notTake = dfs(words, score, freq, idx + 1);

        String word = words[idx];

        boolean possible = true;
        int wordScore = 0;

        for(char c : word.toCharArray()) {

            freq[c - 'a']--;

            if(freq[c - 'a'] < 0)
                possible = false;

            wordScore += score[c - 'a'];
        }

        int take = 0;

        if(possible) {
            take = wordScore +
                   dfs(words, score, freq, idx + 1);
        }

        // Backtrack
        for(char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        return Math.max(take, notTake);
    }
}