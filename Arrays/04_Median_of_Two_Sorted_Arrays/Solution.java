class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n= nums2.length;

        int[] merge = new int[m+n];

        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                merge[k]=nums1[i];
                i++;
            }
            else
            {
                merge[k]=nums2[j];
                j++;

            }
            k++;
        }
        while(i<m)
        {
            merge[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            merge[k]=nums2[j];
            j++;
            k++;
        }
        int size = m+n;
        if(size % 2==0)
        {
            int mid1= merge[size/2-1];
            int mid2= merge[size/2];

            return(mid1+mid2)/2.0;
        }
        else{
            return merge[size/2];
        }
    }
}
