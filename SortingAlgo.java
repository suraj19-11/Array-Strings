public class SortingAlgo {

    //BubbleSort
     public static void Bubble(int nums[]){
        int n = nums.length;
        int swap = 0;
        for(int i=0; i<n-1; i++){
            
            for(int j=0; j<n-1-i; j++){
                if(nums[j]>nums[j+1]){
                    //Swap
                    int temp = nums[j];
                       nums[j] = nums[j+1];
                       nums[j+1] = temp;
                       swap++;
                }   
            }
        }
        System.out.println("Bubble Sort Output:");
        System.out.println("No of swap :" + swap );
         for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    //Selection Sort
    public static void SelectionSort(int nums[]){
        for(int i=0; i<nums.length; i++){
            int minPos = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[minPos] <  nums[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] =temp;
        }
        System.out.println("Selection Sort Output:");
         for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }

    
    public static void main(String[] args) {
        int nums[] = {5,3,2,4,1};
        Bubble(nums);
        SelectionSort(nums);
    }
}
