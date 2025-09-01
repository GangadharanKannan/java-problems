import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int a = 0, b = 1;
        int i = 1;
        while (n >= i){
//            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            i++;
        }
        System.out.println(a);
    }
}
