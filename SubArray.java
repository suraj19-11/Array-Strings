public class SubArray {
    //Fining Subarray for the given array
    public static void Subarr(int num[]){
        int totalSubarr = 0;
        for(int i=0; i<num.length; i++){
            for(int j = i; j<num.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(num[k]+" ");
                    
                }
                totalSubarr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray :"+ totalSubarr);
    }

    
    //Maximum sum using Brute Force method
        // Time Complexity: O(n^3)
       // Space Complexity: O(1)
      
    public static void MaxSubarrSum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;   // -Infinity
        for(int i=0; i<num.length; i++){
            for(int j = i; j<num.length; j++){
                currSum = 0;
                for(int k = i; k<=j; k++){
                    //Subarry sum
                    currSum += num[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }

            }
            System.out.println();
        }
        System.out.println("Maximum Sum :"+ maxSum);
    }




    //Prefix Sum Method to find Maximum Subarray Sum
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    
    public static void MaxSubarrSumPrefix(int num[]){
         int currSum = 0;
        int maxSum = Integer.MIN_VALUE;   // -Infinity
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        //Calculate Prefix array
        // prefix[i] = num[0] + num[1] + ... + num[i]
        for(int i=1; i<num.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j = i; j<num.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }

            }
            System.out.println();
        }
        System.out.println("Maximum Sum :"+ maxSum);

    }

    //Maximum Sum of Subarray using Kadane's Algorithm
    // Time Complexity: O(n)
    // Space Complexity: O(1)

     public static void Kadanes(int num[]){
        int maxSum = Integer.MIN_VALUE;   // -Infinity
        int currSum = 0;
        // Kadane's algorithm iterates through the array and keeps track of the maximum subarray sum
        
        for (int i = 0; i< num.length; i++){
       // currSum = Math.max(num[i], currSum + num[i]); // This line is used to handle the case where all numbers are negative
           
            currSum = currSum + num[i];
            if(currSum < 0){
                currSum = 0; // Reset current sum if it becomes negative
            } 
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum Sum using Kadane's Algorithm: " + maxSum);
        }  
        
        
        public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        Subarr(num);
        MaxSubarrSum(num);
        MaxSubarrSumPrefix(num);
        Kadanes(num);
    }
}
