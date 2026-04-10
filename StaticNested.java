class Outer
{
    static int a=5;
    static class Inner{
        void disp()
        {
            System.out.println(a);
        }
    }
}
class StaticNested{
    public static void main(String[] args)
    {
        Outer.Inner i=new Outer.Inner();
        i.disp();
    }
}