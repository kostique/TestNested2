package athome;

public class Main {

    public static void main(String[] args) {
        MyTestClass myTestClass = new MyTestClass();
        System.out.print("1. From within outer class we can only have an access (direct) to static members of nested class: nest_stat = ");
        myTestClass.test();

        MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();
        System.out.print("2. From within nested class we can only have an access (direct) to static members of outer class : s_out = ");
        myStaticNested.testNested();

        System.out.print("3. We must instantiate an outer class to have an access to its members from within nested class : tn = ");
        myStaticNested.testNested1();

        MyTestClass mtcInner = new MyTestClass();
        MyTestClass.MyInner myInner = mtcInner.new MyInner();
        System.out.print("4. From within inner class we have an access (direct) to all members (even private) of outer class : tIs = ");
        myInner.testInner();
    }
}
