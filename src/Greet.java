import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        if (!name.equals("")){
            System.out.println("Welcome " + name);
        } else {
            System.out.println("please enter something");
        }
    }
}
