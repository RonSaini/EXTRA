import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class q4 {
    public static void display(List<?> list) {
        for (Object obj: list) {
            System.out.print(obj+" ");
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Integer array, 2. String array, 3. Double array ");
        int inp = sc.nextInt();

        if (inp == 1) {
            List<Integer> arr = Arrays.asList(1,2,3,4,5);
            display(arr);
        }
        else if (inp == 2) {
            List<String> arr = Arrays.asList("Sidhant","Harshit","Laxya","John");
            display(arr);
        }
        else if (inp == 3) {
            List<Double> arr = Arrays.asList(1.1,3.7,2.1,4.8);
            display(arr);
        }
        else 
            System.out.println("Invalid input");
        sc.close();
    }
}
