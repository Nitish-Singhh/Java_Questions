class demoo {
    public static int finder(int arr[], int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}

public class searchA_Number {
    public static void main(String[] args) {
        demoo obj = new demoo();
        int arr[] = { 2,5, 7, 3, 8 };
        int num = 5;
        int res = obj.finder(arr, num);

        if (res == -1) {
            System.out.println("Sorry it is not Found In the Array ");
        } else {
            System.out.println(res);
        }

    }
}
