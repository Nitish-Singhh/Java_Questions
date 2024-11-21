public class sumofEvenIndices {
    public static void InidcesSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i=i+2) {
            sum = sum + arr[i];
        }
        System.out.println("the sum of an odd indices Elements  " + sum);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 20, 4, 6, 9 };
        InidcesSum(arr);
    }
}