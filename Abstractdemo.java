abstract class RBI
{
   public abstract float CalculateROI();
   // virtual float CalculateROI() = 0;    Syntax in c++

   public void DisplayRules()
   {
    System.out.println("You have to submit Aadhar card and PAN card");
    System.out.println("Minimum Balance is 10,000");
   }
}

class SBI extends RBI
{
    public float CalculateROI()
    {
        return 5.7f;
    }

}

class BOM extends RBI
{
    public float CalculateROI()
    {
        return 7.7f;
    }

}

class Abstractdemo
{
    public static void main(String Arg[]) 
    {
        // RBI robj = new RBI();

        RBI robj1 = new SBI(); // upcasting 
        RBI robj2 = new BOM(); // upcasting

        SBI sobj = new SBI();  // No casting
        BOM bobj = new BOM();  // No casting

        sobj.DisplayRules();
        bobj.DisplayRules();

        float fRet = 0.0f;
        fRet = sobj.CalculateROI();
        System.out.println("ROI of SBI is : "+fRet);

        fRet = bobj.CalculateROI();
        System.out.println("ROI of BOM is : "+fRet);
        
    }
}