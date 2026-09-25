# Java Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Two strings, $a$ and $b$, are called anagrams if they contain all the same characters in the same frequencies.  For this challenge, the test is not case-sensitive. For example, the anagrams of `CAT` are `CAT`, `ACT`, `tac`, `TCA`, `aTC`, and `CtA`.

**Function Description**    

Complete the *isAnagram* function in the editor.   

*isAnagram* has the following parameters:  

- *string a:* the first string   
- *string b:* the second string   

**Returns**   

- *boolean:* If $a$ and $b$ are case-insensitive anagrams, return true.  Otherwise, return false.   

**Input Format**

The first line contains a string $a$.		
The second line contains a string $b$.

**Constraints**

- $1 \le length(a), length(b) \le 50$
- Strings $a$ and $b$ consist of English alphabetic characters.
- The comparison should NOT be case sensitive. 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T08:39:54.320Z  

```java


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


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-anagrams/problem)