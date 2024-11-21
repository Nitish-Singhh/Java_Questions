import java.util.Scanner;

class SearchTheNumber {
    public int demo(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}

public class searchINArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchTheNumber obj = new SearchTheNumber();
        System.out.println("Enter a number you Want to Find in This Array :-");
        int num = sc.nextInt();
        int arr[] = { 3, 5, 76, 74, 34, 7 };
        int a = obj.demo(arr, num);
        if (a == -1) {
            System.out.println("Sorry,The number you Entered is not available in this Array .");
        }
        else{
        System.out.println("The index value of a given no. is " + a);
        }
        sc.close();
    }

}