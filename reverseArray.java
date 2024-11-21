// import java.util.*;
class reverse {
    public static void rev(int arr[]) {
        int First =0;
        int lastno = arr.length - 1;

        while (First < lastno) {
            int temp = arr[lastno];
            arr[lastno] = arr[First];
            arr[First] = temp;

            First++;
            lastno--;
        }
    }
}

public class reverseArray {
    public static void main(String[] args) {
        reverse obj = new reverse();
        int arr[] = { 34, 23, 6, 2, 76, 54 };
        obj.rev(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
