class Base
{
    public int A;

    public Base()
    {
        System.out.println("Inside Base Deafult Constructor");
        this.A = 11;
    }

    public Base(int i)
    {
        System.out.println("Inside Base Parameterised Constructor");
        this.A = i;
    }


    public void fun()
    {
        System.out.println("Inside Base fun");
    }

}
class Derived extends Base
{
    public int A;

    public Derived()
    {
        super(11);
        System.out.println("Inside Derived Constructor");
        this.A = 51;
         
    }

    public void gun()
    {
        System.out.println("Inside Derived gun");
        System.out.println("Value of A "+A);     // 51
        System.out.println("Value of A "+this.A);// 51
        System.out.println("Value of A "+super.A);// 11
        super.fun();
    }

}
class Superdemo
{
    public static void main(String Arg[]) 
    {
        Derived dobj = new Derived();
        dobj.gun();
        
    }
}