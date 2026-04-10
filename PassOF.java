class A{
    int a;

    A(int i)
    {
        a=i;
    
    }
   A inc()
    {
         A r1=new A(a+10);
        return r1;
    }
}
class PassOF
{
    public static void main(String[] args) {
        {
            A a1=new A(2);
            A a2;
            a2=a1.inc();
            System.out.println(a1.a);
            System.out.println(a2.a);
        }
    }
}