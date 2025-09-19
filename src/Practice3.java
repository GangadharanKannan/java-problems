import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Number :");
        int a = sc.nextInt();
        System.out.println(isPrime(a));
    }
    static String isPrime(int a){
        if (a <= 1){
            return "hello";
        }
        int c = 2;
        while (c*c <= a){
            if (a%c == 0){
                return "hello1";
            }
            c++;
        }
        return (c*c > a)? "hello2": "?";
    }
}
