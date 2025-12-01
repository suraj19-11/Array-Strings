//  import java.util.*;
public class LargestNumber{
    public static int Largest_Number(int numbers[]){
        int largest = Integer.MIN_VALUE;  //-infinity
        for(int i=0; i< numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    
    public static int Smaller_Number(int numbers[]){
        int smallest = Integer.MAX_VALUE;  //+infinity
        for(int i=0; i< numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest value is " + Largest_Number(numbers));
        System.out.println("Smallest value is " + Smaller_Number(numbers));
    }
    
}
