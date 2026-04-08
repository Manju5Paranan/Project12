class Box
{
    double width,height,depth;

    Box(double width,double height,double depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    double volume()
    {
        return width*depth*height;
    }
    
    Box(Box ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }

}
class ObjtoC{
    public static void main(String[] args) {
        {
            Box b1=new Box(12,3,4);
            Box b2=new Box(b1);
            Box b3=new Box(b1);
            double v=b1.volume();
            System.out.println(v);
            v=b2.volume();
            System.out.println(v);
             v=b3.volume();
            System.out.println(v);
        }
    }
}
