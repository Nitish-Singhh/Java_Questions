import java.util.Scanner;

public class Printing_of_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You Elements are :");
        for (int j = 0; j < n; j++) {
            if (arr[j] == 4) {
                //
                break;
            }
            System.out.println(arr[j]);
        }
    }
}
