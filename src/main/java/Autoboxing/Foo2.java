package Autoboxing;

/**
 * Created by izunia on 2015-09-22.
 */
public class Foo2 {
    static int x;                           // trzeba dopisaæ STATIC

    public static void go() {               // static method nie mo¿e korzystaæ z non-static variables
        System.out.println(x);
    }
}
