import java.util.Scanner;
public class ScannerClass{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        System.err.println("Result " + (a+b));
    }
}