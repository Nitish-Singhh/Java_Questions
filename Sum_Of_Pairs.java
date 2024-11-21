import java.util.Scanner;


public class Sum_Of_Pairs {
    static int pair(int arr[],int n){
        int ans=0;
        int target=arr.length;
        for(int i =0; i<n; i++){
           for(int j =1; j<n; j++){
            if(arr[i]+arr[j] == n){
                ans++;
            }
           }
        }
        return ans;
    }
public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   System.out.print("Enter array size ");
   int n =sc.nextInt();
   int arr[]= new int[n];
 for (int i=0; i<n; i++){
    arr[i]=sc.nextInt();
 }

 System.out.print("Enter target sum ");
 int target =sc.nextInt();

 System.out.println(pair(arr ,target));
}
}
    
