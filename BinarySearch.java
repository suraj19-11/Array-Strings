public class BinarySearch {
    public static int binarySearch(int num[],int key){
        int start = 0, end = num.length-1;

        while(start<=end){
            int mid = (start + end)/2;

            //Comparisons
            if(num[mid] == key){
                return mid;
            }
            
            if(num[mid] < key){  //right
                start = mid + 1;
            } else { //left
                end = mid - 1;
            } 
        }
        return start; //if the array element was not found and expected position for the target element
    }

    public static void main(String[] args) {
     int num[] = {2,4,6,8,10,12,14};
     int key = 14;
     System.out.println("The number found at index : "+ binarySearch(num, key));
    }
}
