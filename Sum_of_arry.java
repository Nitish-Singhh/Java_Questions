import java.util.Scanner;

public class Sum_of_arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Size of Array :");
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            sum = arr[j] + sum;
        }
        System.out.println(sum);
    }
}
