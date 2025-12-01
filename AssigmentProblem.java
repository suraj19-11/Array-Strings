public class AssigmentProblem {
    /*Q1. Given an integer array nums, return true if any value appears at least
          twice in the array, and return false if every element is distinct */
    //Approach 1 - Brute Force => TC(O(n^2))
    public static boolean RepetedElement(int nums[]){
        for(int i=0;  i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                
            }
        }
     }
     return false;

    }
    //Approach 2 - Using HashSet
    

    /*Q2.  There is an integer array nums sorted in ascending order (with distinct values).
    Prior to being passed to your function, nums is possibly rotated at an unknown pivot  
    index k (1<=k < nums.length)  such  that  the resulting  array  is [nums[k], nums[k+1], ...,   
    nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).
    For   example, [0,1,2,4,5,6,7] might  be rotated at pivot index 3  and become [4,5,6,7,0,1,2].
    Given the array nums after the possible rotation and an integer target, returnthe index oftarget 
    if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity. */

    public static int SearchInRotatedSortedArray(int nums[],int target){
        int start = 0; 
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Step 1: Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Step 2: Check if left half is sorted
            if (nums[start] <= nums[mid]) {
                // Is target in the left half?
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; // move left
                } else {
                    start = mid + 1; // move right
                }
            }
            // Step 3: Else right half is sorted
            else {
                // Is target in the right half?
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; // move right
                } else {
                    end = mid - 1; // move left
                }
            }
        }

        return -1; // target not foun
        }

    
    public static void main(String[] args){
        // int nums[] = {2,4,5,6,3,4};
        int nums[] = {5,6,7,8,0,1,2,3,4};
        int target = 0;
        System.out.println(RepetedElement(nums));
        System.out.println(SearchInRotatedSortedArray(nums,target));
    }
    
}
