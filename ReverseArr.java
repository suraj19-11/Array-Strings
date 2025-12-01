public class ReverseArr {
    public static void reverse(int num[]){
        int start = 0, end = num.length - 1;
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            //Another method for Swapping without temp variable

            // num[start] = num[start] + num[end];
            // num[end] = num[start] - num[end];
            // num[start] = num[start] - num[end];
            
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int num[]= {2,11,6,5,8,10};
        reverse(num);
        for(int i = 0; i<num.length; i++){
            System.out.print(" " + num[i]);
        }
        // System.out.println();

    }
}
