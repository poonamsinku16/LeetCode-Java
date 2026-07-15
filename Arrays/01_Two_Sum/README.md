# Two Sum

## Title
Two Sum using Brute Force Approach

## Intuition
To find two numbers whose sum equals the target, compare every possible pair of elements. Once a pair with the required sum is found, return their indices.

## Approach
- Traverse the array using the first loop.
- For each element, use a second loop to check the remaining elements.
- If the sum of two elements equals the target, return their indices.
- If no pair is found, return `{-1, -1}`.

## Time Complexity
O(n²)

## Space Complexity
O(1)
