import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++){
            checkArmstrong(i);
        }
    }
    static void checkArmstrong(int num){
        int digit = 0, count = 0 , res = 0;
        int number = num;
        while(number > 0){
            number = number/10;
            count++;
        }
        number = num;
        while (number > 0){
            digit = number%10;
            res += Math.pow(digit, count);
            number = number/10;
        }
        System.out.println((num == res) ? "it is Armstrong" : "not");
    }
}
