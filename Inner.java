class Outer
{
private int a=5;
     class Inner1{
        void display()
        {
            System.out.println(a);
        }
    }
}
class Inner{
    public static void main(String[] args)
    {
       Outer obj=new Outer();
        Outer.Inner1 i= obj.new Inner1();
        i.display();
    }
}