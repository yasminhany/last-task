import java.util.Scanner;
class book implements product{
    Scanner input=new Scanner(System .in);
    String name;
    public void setname()
    {
        System.out.println("Enter name of the book :  ");
        name=input.nextLine();
    }
    public void getname(){
        System.out.println("the book name is : "+name);
    }

    public double  getprice()
    {

        return (price-(price*0.2));
    }
}
class cartoon extends book {
    public double getprice() {
       return (price - (price * 0.5));
    }
}
class childrenbook extends book {
    public double getprice()
    {
       return (price - (price * 0.4));
    }

    public static void main(String[] arg) {
        product[] a = new product[3];
        a[0] = new book();
        a[1] = new childrenbook();
        a[2] = new cartoon();
        a[0].setname();
        a[0].getname();
        System.out.println("COAST OF THIS PRODUCT = "+a[0].getprice()+" $");
        a[1].setname();
        a[1].getname();
        System.out.println("COAST OF THIS PRODUCT = "+a[1].getprice()+" $");
        a[2].setname();
        a[2].getname();
        System.out.println("COAST OF THIS PRODUCT = "+a[2].getprice()+" $");
        System.out.println("SO TOTAL COAST OF PRODUCTS = "+(a[2].getprice()+a[1].getprice()+a[0].getprice())+" $");
    }
}
