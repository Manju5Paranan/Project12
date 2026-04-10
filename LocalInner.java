class O{
     private int a=5;
    void disp()
    {
        class  I{
            void m()
            {
                System.out.print("Manju");
                System.out.println(a);
            }
        }
        I i1=new I();
        i1.m();
    }
}
class LocalInner{
    public static void main(String[] args)
    {
        O o1=new O();
        o1.disp();
    }
}