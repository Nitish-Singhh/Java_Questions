public class MaxElementsofArray {
    public static void MaxElements(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum elements is : " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 34, 21, 54, 65, 43 };
        MaxElements(arr);
    }

}