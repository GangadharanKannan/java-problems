public class practice {
    public static void main(String[] args) {
        String a = "   Hello world";
        a = fun(a);
        System.out.println(a);
    }
    static String fun(String a){
        return a.toUpperCase();
    }
}
