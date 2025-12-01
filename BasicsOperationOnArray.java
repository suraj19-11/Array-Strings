import java.util.*;
public class BasicsOperationOnArray {
    public static void main(String args[]){
        //Creating a array of size 100

        int marks[] = new int[100];
        //Input
        Scanner sc = new Scanner(System.in);
        

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy :"+ marks[0]);
        System.out.println("Chem :"+ marks[1]);
        System.out.println("Math :"+ marks[2]);

        //update
        marks[2] = marks[2]+1;
        System.out.println("Math :"+ marks[2]);

        System.out.println("Size of the array :" + marks.length);

        sc.close();
    }
}
