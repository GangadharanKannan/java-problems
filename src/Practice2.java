public class Practice2 {
    public static void main(String[] args) {
        fun("hello");
        fun(7);
    }
    static String fun(String a){
        System.out.println(a);
        return a;
    }
    static int fun(int a){
        System.out.println(a);
        return a;
    }
}
