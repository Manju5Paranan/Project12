class A{
    void m1()
    {
        System.out.println("Java");
    }
}
class B extends A{
    void m2()
    {
        System.out.println("Program");
    }
}
class C extends B{
    void m3()
    {
        System.out.println("C");
    }
}
class Add{
    public static void main(String[] args)
    {
        C b1=new C();
        b1.m1();
        b1.m2();
        b1.m3();
    }
}