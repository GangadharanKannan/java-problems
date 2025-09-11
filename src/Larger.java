import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 0;
        while (num != 0){
            if (num > max){
                max = num;
            }
            num = sc.nextInt();
        }
        System.out.println("the output is : " +max);
    }
}
