import java.util.Scanner;

public class try_And_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = 5;
        arr[1] = 34;
        arr[2] = 32;
        arr[3] = 52;
        System.out.println("Enter a index number ");
        int ind = sc.nextInt();

        System.out.println("Enter a number you want to devide with ");
        int number = sc.nextInt();
        try {
            System.out.println("your Entered index number is : " + ind);
            System.out.println("The value of array-value/number is:" + arr[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error here ");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds you have given a wrong index value ");
            System.out.println(e);

        } catch (Exception e) {
            System.out.println("Some Error here ......");
            System.out.println(e);
        }
    }
}
