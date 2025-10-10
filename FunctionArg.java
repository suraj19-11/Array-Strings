// import java.util.Arrays;
public class FunctionArg {
    public static void update(int marks[]){  //Update uing call by reference
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i]+1;
        }
        // System.out.println(Arrays.toString(marks));
    }
    public static void main(String[] args) {
        int marks[] = {12,45,54};
        update(marks);

        //print our marks
          for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
