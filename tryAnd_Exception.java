public class tryAnd_Exception {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int result = 0;
        try {
            result = a / b;
            System.out.println("I am in Try block ");
        } catch (RuntimeException e) {
            System.out.println("something get Wrong ");
        }
        System.out.println(result);
        System.out.println("Bye ");
    }
}
