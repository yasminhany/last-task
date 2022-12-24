class circle{
    double radius;
    String color;
    public circle()

    {
        System.out.println("ARE YOU READY?") ;
    }
    public circle(double radius)
    {
        this.radius=radius;
    }
    public circle(double radius,String color)
    {
        this.radius=radius;
        this.color=color;
    }
    public void setradius(double radius)
    {
        this.radius=radius;
    }
    public double getradius()
    {
        return radius;
    }
    public void  setcolor(String color)

    {
        this.color=color;
    }
    public String getcolor()
    {
        return color;
    }
    public double getarea()
    {
        return 3.14*radius*radius;
    }
    @Override
   public String toString()
    {
        return "color of the circle is "+color+" , radius of the circle = "+radius+" , so area of the circle = "+getarea();
    }
}
class cylinder extends circle
{
    double height;
    public cylinder()
    {
        System.out.println("Let's start...") ;
    }
    public cylinder(double height)
    {
        this.height=height;
    }
    public cylinder(double height,double radius)
    {
        this.height=height;
        this.radius=radius;
    }
    public cylinder(double height,double radius,String color)
    {
        this.height=height;
        this.radius=radius;
        this.color=color;
    }
    public void  setheight(double height)

    {
        this.height=height;
    }
    public double  gethight()
    {
        return height;
    }
    public double  getvolume ()
    {
        double c=getarea();
        return (c*height);
    }
    @Override
    public String toString()
    {
        return "color of the circle is "+color+" , radius of the circle = "+radius+" , so area of the circle = "+getarea()+" , if we give height to the circle = "+height+" , then volume of cylinder = "+getvolume();
    }
    public static void main(String [] arg)
    {
        cylinder obj=new cylinder();
        obj.setcolor("red");
        obj.setradius(5);
        obj.setheight(5);
        System.out.println(obj);
    }
}