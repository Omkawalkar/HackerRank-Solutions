

    static boolean isAnagram(String a, String b) {
           // If lengths are different, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Frequency array for 26 English letters
        int[] frequency = new int[26];

        // Count characters in first string
        for (int i = 0; i < a.length(); i++) {
            frequency[a.charAt(i) - 'a']++;
        }

        // Remove characters using second string
        for (int i = 0; i < b.length(); i++) {
            frequency[b.charAt(i) - 'a']--;
        }

        // Check if all frequencies are zero
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                return false;
            }
        }

        return true;
    }

