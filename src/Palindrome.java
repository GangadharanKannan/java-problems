import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence : ");
        String str = sc.nextLine();
        reverse(str);
    }
    static void reverse(String str){
        String rev = "";
        for (int i = str.length() - 1; i >= 0 ; i--){
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("The word " + str + " is palindrome");
        }
        else {
            System.out.println("The word " + str + " is not palindrome");
        }
    }
}
