# Remove Duplicates from Sorted Array

## Title
Two Pointer Approach for Removing Duplicates

## Intuition
Since the array is sorted, duplicate elements are placed next to each other. We only need to keep the unique elements.

## Approach
- Initialize pointer `i` at index 0.
- Traverse the array using pointer `j`.
- Whenever `nums[i]` is different from `nums[j]`, move `i` forward and store the new unique element.
- Return `i + 1` as the count of unique elements.

## Time Complexity
O(n)

## Space Complexity
O(1)
