import java.util.Scanner;

public class F_prints {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number ");
    int n= sc.nextInt();
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i==0||j==0|| i==(n-1)/2 ){
            System.out.print("* ");
            }
        }
        System.out.println(" ");
    }
    System.out.println();
}
}
