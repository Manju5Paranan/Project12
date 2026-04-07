class A{
    int a,b;
    A(int i,int c)
    {
        a=i;
        b=c;;
    }
        A inc()
        {
            A r1=new A(a+2,b+3);
            return r1;
        }
}
public class S{
    public static void main(String[] args) {
        A a1=new A(2,5);
        A a2;
        a2=a1.inc();
        System.out.println(a1.a+a1.b);
        System.out.println(a2.a+a2.b);
    }
}