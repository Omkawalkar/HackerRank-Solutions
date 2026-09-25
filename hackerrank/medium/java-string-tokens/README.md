# Java Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string, $s$, matching the regular expression `[A-Za-z !,?._'@]+`, split the string into *tokens*. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

**Note:** You may find the [String.split](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-) method helpful in completing this challenge.

**Input Format**

A single string, $s$.

**Constraints**

- $1 \le \text{ length of } s \le 4 \cdot 10^5$
- $s$ is composed of *any* of the following: English alphabetic letters, blank spaces, exclamation points (`!`), commas (`,`), question marks (`?`), periods (`.`), underscores (`_`), apostrophes (`'`), and at symbols (`@`).

**Output Format**

On the first line, print an integer, $n$, denoting the number of tokens in string $s$ (they *do not* need to be unique). Next, print each of the $n$ tokens on a new line in the same order as they appear in input string $s$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T08:39:57.246Z  

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

[View on HackerRank](https://www.hackerrank.com/challenges/java-string-tokens/problem)