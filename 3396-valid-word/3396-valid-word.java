class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean hasVowel = false;
        boolean hasConsonant = false;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            char lower = Character.toLowerCase(ch);
            if ("aeiou".indexOf(lower) >= 0) {
                hasVowel = true;
            } else if (Character.isLetter(lower)) { 
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }
}