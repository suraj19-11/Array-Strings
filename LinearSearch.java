public class LinearSearch {
    public static int Linear_Search(int numbers[],int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {12,123,23,64,43};
        int key = 20;

        int index = Linear_Search(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at index :" + index);
        }
    }
}
