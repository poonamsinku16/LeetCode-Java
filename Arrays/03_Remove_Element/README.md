# Remove Element

## Title
Remove Element using Two Pointer Approach

## Intuition
We need to remove all occurrences of the given value from the array. Instead of creating a new array, we overwrite the elements that are not equal to the given value.

## Approach
- Initialize a pointer `k` to 0.
- Traverse the array using a loop.
- If the current element is not equal to `val`, place it at index `k` and increment `k`.
- After the loop, return `k` as the number of remaining elements.

## Time Complexity
O(n)

## Space Complexity
O(1)
