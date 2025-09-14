import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        fun("h1","h2","h3");
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
