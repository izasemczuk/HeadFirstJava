package Autoboxing;

/**
 * Created by izunia on 2015-09-22.
 */
public class TestBox {

    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();

        Foo1 foo1 = new Foo1();
        Foo2 foo2 = new Foo2();
        Foo3 foo3 = new Foo3();
        Foo4 foo4 = new Foo4();
        Foo5 foo5 = new Foo5();
        Foo6 foo6 = new Foo6();

        System.out.println("Foo1");
        foo1.go();
        System.out.println("Foo2");
        foo2.go();
        System.out.println("Foo3");
        foo3.go();
        System.out.println("Foo4");
        foo4.go();
        System.out.println("Foo5");
        foo5.go(5);
        System.out.println("Foo6");
        foo6.go(42);
    }

    public void go(){
        i=j;
        System.out.println(j);
        System.out.println(i);
    }





}

