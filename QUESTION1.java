import java.util.Scanner;
abstract class product{
    Scanner input= new Scanner(System.in) ;
    int price;
    String name;
    void setname()
    {
        System.out.println("Enter name of the book :  ");
        name=input.nextLine();
    }
    void getname()
    {
        System.out.println("the book name is : "+name);
    }
    abstract void  setprice(int price);
    abstract double  getprice();
}
class book extends product{

    void  setprice(int price)
    {
        this.price=price;
    }
    double getprice()
    {
         return (price-(price*0.2)) ;
    }
}
class childrenbook extends book{
    double getprice()
    {
         return (price-(price*0.4)) ;
    }
    public static void main(String[] arg)
    {
        product [] a=new product[2];
        a[0]=new book();
        a[1]=new childrenbook();
        a[0].setname();
        a[0].getname();
        a[0].setprice(100);
        System.out.println("IT COAST "+a[0].getprice()+" $");
        a[1].setname();
        a[1].getname();
        a[1].setprice(100);
        System.out.println("IT COAST "+a[1].getprice()+" $");
        System.out.println("TOTAL COAST OF PRODUTS = "+(a[1].getprice()+a[0].getprice())+"$");
    }
}