# Median of Two Sorted Arrays

## Title
Find Median of Two Sorted Arrays using Merge Technique

## Intuition
The two arrays are already sorted. By merging them into a single sorted array, we can easily find the median based on whether the total number of elements is odd or even.

## Approach
- Find the lengths of both arrays.
- Create a new array to store the merged elements.
- Compare elements from both arrays and merge them in sorted order.
- If the total number of elements is odd, return the middle element.
- If the total number of elements is even, return the average of the two middle elements.

## Time Complexity
O(m + n)

## Space Complexity
O(m + n)
