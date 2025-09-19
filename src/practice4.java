public class practice4 {
    public static void main(String[] args) {
        char a = 'A';
        if((int) a >= 65 && (int) a <= 122){
            if((int) a >= 65 && (int) a <= 90){
//                converting from uppercase to lowercase
                char b = (char) (a + 32);
                System.out.println(b);
            }
            if((int) a >= 97 && (int) a <= 122){
                char b = (char) (a - 32);
                System.out.println(b);
            }
        }
    }
}
