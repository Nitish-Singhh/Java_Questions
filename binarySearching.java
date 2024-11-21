import java.util.Scanner;

public class binarySearching {
public static int Search(int arr[],int target){
      int start=0; int last=arr.length-1;
      while (start<= last) {
        int mid = start+ (last-start)/2;
            if (arr[mid]==target) {
                return mid;
            }
        else if(arr[mid]<target){
                  start =mid+1;
        }
        else{
            last =mid-1;
        }
        return last;
      }
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Size of An Array :");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter an Elements In Array :");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a Number You Want to Search in Array :");
        int target =sc.nextInt();
        int result =Search(arr, target);
            if (result==0) {
                System.out.println("Not Found Elements");
            }
            else{
                System.out.println("Congtratulation , Elements is Found In This Array ");
            }
    }
}