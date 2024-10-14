# Leetcode 217. Contains Duplicate

## The Problem

Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

### Example 1:
```Java
Input: nums = [1, 2, 3, 3]

Output: true
```

### Example 2:
```Java
Input: nums = [1, 2, 3, 4]

Output: false
```

## The Solution

In this problem you are given an integer array of numbers and must return true if that array contains a duplicate value. The most efficient way to solve this problem (in java at least) is to create a hash set as it can only contain unique values. The code will loop through the length of the array and add each value at index i to the hashset. If the hash set does not add the value, that means there must be a duplicate and it will return true. If all values are successfully added to the hash set then there must not be any duplicates. 

```Java
public static boolean hasDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
        if (!set.add(nums[i])) {
            return true;
        }
    }
    return false;
}
```

This successfully solves the problem in O(n) time with O(n) space complexity.