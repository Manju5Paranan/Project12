class A
{
    int a;
    A(int a)
    {
        this.a=a;
    }
    A inc()
    {
        A obj = new A(a+2);
        return obj;
    }
}
class ReturnObj{
    public static void main(String[] args) {
        A a1=new A(10);
    A a2;

    a2 = a1.inc();
    System.out.println(a1.a);
    System.out.println(a2.a);
        
    }
    
}