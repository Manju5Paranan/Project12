class Add{
    int a,b;
    Add(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void sum(Add A1)
    {
        int c=A1.a+A1.b;
        System.out.println(c);
    }
}
class ObjtoF{
    public static void main(String[] args)
    {
        Add A= new Add(5,6);
        A.sum(A);
    }
}