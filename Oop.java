class Arithematic
{
    public int No1;
    public int No2;

    public Arithematic()  // Deafauit constructor
    {
    System.err.println("Inside Deafult Constructor");    
    this.No1 = 0;
    this.No2 = 0;
    }

    public Arithematic(int i , int j) // Parameterised Constructor
    {
     System.err.println("Inside Parameterised Constructor");     
    this.No1 = i;
    this.No2 = j;
    }

    public int Addition()
    {
        int Ans = 0;
        Ans = this.No1 + this.No2;
        return  Ans;
    }

    public int Substraction()
    {
        int Ans = 0;
        Ans = this.No1 - this.No2;
        return  Ans;
    }
}

class Oop
{
    public static void main(String Arg[]) 
    {
        System.out.println("Inside Main Function");

        Arithematic obj1 = new Arithematic();
        Arithematic obj2 = new Arithematic(11,10);

        int iret = 0;

        iret = obj1.Addition();
        System.out.println("Addition is : "+iret);

        iret = obj1.Substraction();
        System.out.println("Substraction is : "+iret);

        iret = obj2.Addition();
        System.out.println("Addition is : "+iret);

        iret = obj2.Substraction();
        System.out.println("Substraction is : "+iret);
        

    }
}