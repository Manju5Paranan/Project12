class O
{
static int a=5;
    static class I{
        void display()
        {
            System.out.println(a);
        }
    }
}
class Inner{
    public static void main(String[] args)
    {
       // O o=new O();
        O.I i=new O.I();
        i.display();
    }
}