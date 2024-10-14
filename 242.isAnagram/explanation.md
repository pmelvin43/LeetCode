# Leetcode 242. Valid Anagram

## The Problem

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

### Example 1:
```Java
Input: s = "anagram", t = "nagaram"

Output: true
```

### Example 2:
```Java
Input: s = "rat", t = "car"

Output: false
```

## The Solution

In this problem you are given two strings 's' and 't' and must return true if they are anagrams of one another. The most simple way I could think of to do this is to simply put the strings in char arrays, sort said arrays, and see if they equal one another. Once they are sorted then the letters will be in the same order and you can then compare them. 

```Java
public static boolean isAnagram(String s, String t) {

    char[] first = s.toCharArray();
    char[] second = t.toCharArray();

    Arrays.sort(first);
    Arrays.sort(second);

    return Arrays.equals(first, second);
}
```

This successfully solves the problem in O(n log n) time with O(n) space complexity. There is probably a more efficient way to do this without separately sorting two arrays, but O(n log n) seemed good enough to me. 