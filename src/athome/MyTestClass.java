package athome;

   class MyTestClass {
   private int out = 10;
   private  static int s_out = 70;

    void test(){
        System.out.println(MyStaticNested.nest_stat);
        MyTestClass mtcInner0 = new MyTestClass();
        MyTestClass.MyInner myInner0 = mtcInner0.new MyInner();
        MyTestClass.MyStaticNested myStaticNested0 = new MyTestClass.MyStaticNested();
    }

    static class MyStaticNested{
        static int nest_stat = 60;
        int nest = 32;

        void testNested(){
            System.out.println(s_out);
        }
        void testNested1(){
            MyTestClass myTestClass = new MyTestClass();
            int tn = 0;
            tn = nest + myTestClass.out;
            System.out.println(tn);
        }
    }
    class MyInner{
        int inn = 50;
        void testInner(){
            final int tI = 63;
            int tIs = 0;
            tIs = inn + out + s_out + MyStaticNested.nest_stat;
            System.out.println(tIs);
            class MyLocal{
                private int loc = 20;
                private void testLocal(){
                    int tl = 0;
                    tl = loc + inn + tI + out + MyStaticNested.nest_stat + MyTestClass.s_out;
                    System.out.println("tl = " + tl);
                }
            }
            System.out.print("5. From within local class we have an access to final (or effectively final) local variables of its containing method, + other members that its inner class has an access to: ");
            MyLocal myLocal = new MyLocal();
            myLocal.testLocal();
        }
    }
}
