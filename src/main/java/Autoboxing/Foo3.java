package Autoboxing;

/**
 * Created by izunia on 2015-09-22.
 */
public class Foo3 {
    final int x;                      // final variable WYMAGA zainicjalizowania, wprost lub przez konstruktor

    public Foo3() {
        x = 15;
    }

    public void go() {
        System.out.println(x);
    }
}
